package com.oracle.log.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.oracle.log.service.api.LogServiceApi;
import com.oracle.mapper.LogsMapper;
import com.oracle.pojo.Logs;
import com.oracle.pojo.vo.LogsVo;
import com.oracle.pojo.vo.Page;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author HuangHaoD
 * @create 2022/08/22 11:12
 */
@Service
public class LogServiceImpl implements LogServiceApi {


    @Autowired
    private LogsMapper logsMapper;

    @Override
    public void addLog(LogsVo logsVo) {
        Logs logs=new Logs();
        BeanUtils.copyProperties(logsVo,logs);
        logsMapper.insert(logs);
    }

    @Override
    public Page<List<LogsVo>> getLogList(Integer pageNum, Integer pageSize) {
        com.github.pagehelper.Page<Logs> page = PageHelper.startPage(pageNum, pageSize);
        logsMapper.selectByExample(null);
        List<Logs> result = page.getResult();
        List<LogsVo> logsVoList = result.stream().map(logs -> {
            LogsVo logsVo = new LogsVo();
            BeanUtils.copyProperties(logs, logsVo);
            return logsVo;
        }).collect(Collectors.toList());
        Page pageInfo=new Page();
        pageInfo.setPageNums(pageNum);
        pageInfo.setPageSize(pageSize);
        pageInfo.setAllRow(page.getTotal());
        pageInfo.setTotalPage(page.getPages());
        pageInfo.setData(logsVoList);
        return pageInfo;
    }
}