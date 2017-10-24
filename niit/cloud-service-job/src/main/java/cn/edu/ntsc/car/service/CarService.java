package cn.edu.ntsc.car.service;

import java.util.List;

import cn.edu.ntsc.car.domain.Car;

/*
 * 模糊查找汽车信息
 */
public interface CarService {

    /**
     * 根据车牌号，模糊查找汽车信息
     * @param plateNumber
     */
	List<Car> findCarByPlateNumber(String plateNumber);
}
