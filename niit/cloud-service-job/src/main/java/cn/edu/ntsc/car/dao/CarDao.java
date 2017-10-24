package cn.edu.ntsc.car.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import cn.edu.ntsc.car.domain.Car;


/**
 * 
 * @author nt_li
 *
 */
@Repository
public interface CarDao {

	/**
     * 根据车牌号，模糊查找汽车信息
     * @param cityName
     */
    List<Car> findCarByPlateNumber(@Param("plateNumber") String plateNumber);
    
}
