package com.oracle.config.service.api;

import com.oracle.pojo.dto.ServiceResult;
import com.oracle.pojo.vo.SystemconfigVo;

import java.util.List;

/**
 * @author HuangHaoD
 * @create 2022/08/18 21:23
 */
public interface ConfigServiceApi {

    /**
     * 查询所有的系统设置值
     * @author HuangHaoD
     * @date 2022/8/23 9:18
     * @return com.oracle.pojo.dto.ServiceResult<java.util.List<com.oracle.pojo.vo.SystemconfigVo>>
     */
    ServiceResult<List<SystemconfigVo>> getSystemConfigList();
    /**
     * 修改系统设置的值
     * @author HuangHaoD
     * @date 2022/8/23 9:18
     * @param systemconfigVo
     * @return com.oracle.pojo.dto.ServiceResult
     */
    ServiceResult updateSystemConfigById(SystemconfigVo systemconfigVo);
    /**
     * 把指定的值恢复未默认值
     * @author HuangHaoD
     * @date 2022/8/23 9:18
     * @param id
     * @return com.oracle.pojo.dto.ServiceResult
     */
    ServiceResult defaultSystemConfig(Integer id);
    /**
     * 所有的值都恢复默认值
     * @author HuangHaoD
     * @date 2022/8/23 9:18
     * @return com.oracle.pojo.dto.ServiceResult
     */
    ServiceResult defaultSystemConfig();
    /**
     * 查询指定的系统设置值
     * @author HuangHaoD
     * @date 2022/8/23 9:19
     * @param id
     * @return com.oracle.pojo.dto.ServiceResult
     */
    ServiceResult getSystemConfigById(Integer id);

}
