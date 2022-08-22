package com.oracle.config.service.api;

import com.oracle.pojo.dto.ServiceResult;
import com.oracle.pojo.vo.SystemconfigVo;

import java.util.List;

/**
 * @author HuangHaoD
 * @create 2022/08/18 21:23
 */
public interface ConfigServiceApi {

    ServiceResult<List<SystemconfigVo>> getSystemConfigList();

    ServiceResult updateSystemConfigById(SystemconfigVo systemconfigVo);

    ServiceResult defaultSystemConfig(Integer id);

    ServiceResult defaultSystemConfig();

    ServiceResult getSystemConfigById(Integer id);

}
