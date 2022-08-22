package com.oracle.repertory.service.api;

import com.oracle.pojo.Car;
import com.oracle.pojo.vo.CarVo;
import com.oracle.pojo.vo.CarbrandVo;
import com.oracle.pojo.vo.CarseriesVo;

import java.util.List;

/**
 * @author ltcstart
 * @date 2022/8/22 - 11:59
 */
public interface CarServiceApi {

    /**
     * 查询所有的汽车品牌
     * @return List<CarbrandVo>
     */
    List<CarbrandVo> findCarBrandList();

    /**
     * 通过汽车品牌id查询汽车车系
     * @param brandId
     * @return List<CarseriesVo>
     */
    List<CarseriesVo> findCarseriesListByBrandId(Integer brandId);

    /**
     * 通过车系id获取车的信息
     * @param seriesId
     * @return List<CarVo>
     */
    List<CarVo> findCarListBySeriesId(Integer seriesId);

}
