package com.oracle.repertory.service.api;

import com.oracle.pojo.vo.Page;
import com.oracle.pojo.vo.RepertoryBo;
import com.oracle.pojo.vo.RepertoryVo;

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
    int addRepertory(RepertoryVo repertoryVo);

    /**
     *
     * @param pageNum 第几页
     * @param pageSize 页面大小
     * @return 返回一个page对象
     */
    Page<List<RepertoryBo>>  getRepertoryListPage(Integer pageNum, Integer pageSize);
}
