package com.oracle.mapper;

import com.oracle.pojo.Systemconfig;
import com.oracle.pojo.SystemconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SystemconfigMapper {
    int countByExample(SystemconfigExample example);

    int deleteByExample(SystemconfigExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Systemconfig record);

    int insertSelective(Systemconfig record);

    List<Systemconfig> selectByExample(SystemconfigExample example);

    Systemconfig selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Systemconfig record, @Param("example") SystemconfigExample example);

    int updateByExample(@Param("record") Systemconfig record, @Param("example") SystemconfigExample example);

    int updateByPrimaryKeySelective(Systemconfig record);

    int updateByPrimaryKey(Systemconfig record);
}