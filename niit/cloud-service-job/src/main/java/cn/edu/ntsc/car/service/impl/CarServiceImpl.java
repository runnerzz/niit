package cn.edu.ntsc.car.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.ntsc.car.dao.CarDao;
import cn.edu.ntsc.car.domain.Car;
import cn.edu.ntsc.car.service.CarService;

/**
 * 
 * @author nt_li
 *
 */
@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    public List<Car> findCarByPlateNumber(String plateNumber) {
        return carDao.findCarByPlateNumber(plateNumber);
    }


}
