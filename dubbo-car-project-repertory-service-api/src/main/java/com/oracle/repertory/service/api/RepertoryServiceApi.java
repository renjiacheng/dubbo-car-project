package com.oracle.repertory.service.api;

import com.oracle.pojo.dto.ServiceResult;
import com.oracle.pojo.vo.Page;
import com.oracle.pojo.vo.RepertoryBo;
import com.oracle.pojo.vo.RepertoryVo;
import com.oracle.pojo.vo.SearchBean;

import java.util.List;

/**
 * @author ltcstart
 * @date 2022/8/22 - 11:20
 */
public interface RepertoryServiceApi {
    /**
     * 添加库存
     * @param repertoryVo
     * @return 大于0表示添加成功
     */
    ServiceResult addRepertory(RepertoryVo repertoryVo);

    /**
     * 修改库存数量
     * @param repertortId
     * @param num
     * @return
     */
    ServiceResult updateRepertoryNum(Integer repertortId,Integer num);

    /**
     *
     * @param pageNum 第几页
     * @param pageSize 页面大小
     * @return 返回一个page对象
     */
    Page<List<RepertoryBo>>  getRepertoryListPage(Integer pageNum, Integer pageSize);


    List<RepertoryBo> searchRepertoryMatch(SearchBean searchBean);
}
