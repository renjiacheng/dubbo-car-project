package com.oracle.log.service.api;

import com.oracle.pojo.vo.LogsVo;
import com.oracle.pojo.vo.Page;

import java.util.List;

/**
 * @author HuangHaoD
 * @create 2022/08/22 11:04
 */
public interface LogServiceApi {
    /**
     * 插入日志信息
     * @author HuangHaoD
     * @date 2022/8/23 9:21
     * @param logsVo
     */
    void addLog(LogsVo logsVo);

    /**
     * 分页查询日志的信息
     * @author HuangHaoD
     * @date 2022/8/23 9:21
     * @param pageNum
     * @param pageSize
     * @return com.oracle.pojo.vo.Page<java.util.List<com.oracle.pojo.vo.LogsVo>>
     */
    Page<List<LogsVo>> getLogList(Integer pageNum, Integer pageSize);
}
