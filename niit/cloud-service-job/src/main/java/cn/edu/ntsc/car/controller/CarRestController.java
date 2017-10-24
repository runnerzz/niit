package cn.edu.ntsc.car.controller;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.edu.ntsc.car.domain.Car;
import cn.edu.ntsc.car.service.CarService;
import lombok.extern.slf4j.Slf4j;

/**
 * 
 * @author nt_li
 *
 */
@Slf4j
@RestController
public class CarRestController {

    @Resource
    private CarService carService;
    
    @Autowired
    private DiscoveryClient client;

    @Autowired
    RedisTemplate<String, Car> redisTemplate;
    
    
    @RequestMapping(value = "/api/car/search", method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "fallbackFindCarByPlateNumber")
    public List<Car> findCarByPlateNumber(@RequestParam(value = "plateNumber") String plateNumber) {
    	ServiceInstance instance = client.getLocalServiceInstance();
    	List<Car> cars = carService.findCarByPlateNumber(plateNumber);
    	log.info("/findCarByPlateNumber, host:" + instance.getHost() + ", service_id:" + instance.getServiceId() + ", result:" + cars);
        return cars;
    }
    
    
    public List<Car> fallbackFindCarByPlateNumber(String plateNumber) {
    	List<Car> cars = new ArrayList<>();
		Car car = new Car();
		car.setName("error");
		cars.add(car);
		return cars;
	}
    
    
    /*
    @RequestMapping(value = "/api/cache", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.CREATED)
    public void setCache() {
    	Car city = cityService.findCityByName("温岭市");
    	redisTemplate.opsForValue().set("key-1", city, 60*60);
        System.err.println("cached");
    }
    
    @RequestMapping(value = "/api/getcache", method = RequestMethod.GET)
    public Car getCache() {
    	Car user = redisTemplate.opsForValue().get("key-1");
        log.debug("{}", user);
        return user;
    }*/

}
