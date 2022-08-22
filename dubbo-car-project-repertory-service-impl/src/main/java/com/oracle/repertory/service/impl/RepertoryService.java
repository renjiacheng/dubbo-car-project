package com.oracle.repertory.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.oracle.pojo.vo.Page;
import com.oracle.pojo.vo.RepertoryVo;
import com.oracle.repertory.service.api.RepertoryServiceApi;

import java.util.List;

/**
 * @author ltcstart
 * @date 2022/8/22 - 11:45
 */
@Service
public class RepertoryService implements RepertoryServiceApi {
    @Override
    public int addRepertory(RepertoryVo repertoryVo) {
        return 0;
    }

    @Override
    public Page<List<RepertoryVo>> getRepertoryListPage(Integer pageNum, Integer pageSize) {
        return null;
    }
}
