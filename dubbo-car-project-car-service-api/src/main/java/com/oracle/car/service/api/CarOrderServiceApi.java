package com.oracle.car.service.api;


import com.oracle.pojo.vo.CarOrderNumVo;
import com.oracle.pojo.vo.CarorderVo;

import java.util.List;


/**
 * @author HuangHaoD
 * @create 2022/08/22 11:42
 */
public interface CarOrderServiceApi {

    /**
     * 添加订单
     * @author HuangHaoD
     * @date 2022/8/22 13:44
     * @param carorderVo
     * @return int
     */
    void insertCarOrder(CarorderVo carorderVo);

    /**
     * 更新订单
     * @author HuangHaoD
     * @date 2022/8/22 13:46
     * @param carorderVo
     * @return int
     */
    void updateCarOrder(CarorderVo carorderVo);

        /**
         * 审核订单
         * @author HuangHaoD
         * @date 2022/8/22 13:48
         * @param id
         * @return int
         */
    void updateCarType(Integer id);

    /**
     * 查询订单的状态
     * @author HuangHaoD
     * @date 2022/8/23 10:48
     * @param id
     * @return java.lang.String
     */
    CarorderVo findByOrderType(Integer id);

    List<CarOrderNumVo> getList();

}
