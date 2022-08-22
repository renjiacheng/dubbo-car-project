package com.oracle.log.service.api;

import com.oracle.pojo.vo.LogsVo;
import com.oracle.pojo.vo.Page;

import java.util.List;

/**
 * @author HuangHaoD
 * @create 2022/08/22 11:04
 */
public interface LogServiceApi {
    void addLog(LogsVo logsVo);

    Page<List<LogsVo>> getLogList(Integer pageNum, Integer pageSize);
}
