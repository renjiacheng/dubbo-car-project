package com.oracle.car.service.api;

import com.oracle.pojo.vo.CarVo;
import com.oracle.pojo.vo.Page;

import java.util.List;

/**
 * @author HuangHaoD
 * @create 2022/08/22 11:42
 */
public interface CarServiceApi {

    /**
     * 展示汽车
     * @author HuangHaoD
     * @date 2022/8/22 11:43
     * @param pageNum
     * @param pageSize
     * @return com.oracle.pojo.vo.Page<java.util.List<com.oracle.pojo.vo.CarVo>>
     */
    Page<List<CarVo>> getCarList(Integer pageNum,Integer pageSize);



}
