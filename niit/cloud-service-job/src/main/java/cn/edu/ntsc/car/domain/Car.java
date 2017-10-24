package cn.edu.ntsc.car.domain;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @author nt_li
 *
 */
@Data
public class Car implements Serializable {


    /**
     * 车辆所有者
     */
    private String name;

    /**
     * 车牌号
     */
    private String plateNumber;

    /**
     * 联系电话
     */
    private String tel;
}
