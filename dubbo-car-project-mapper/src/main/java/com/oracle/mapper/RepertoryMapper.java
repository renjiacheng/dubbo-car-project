package com.oracle.mapper;

import com.oracle.pojo.Repertory;
import com.oracle.pojo.RepertoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RepertoryMapper {
    int countByExample(RepertoryExample example);

    int deleteByExample(RepertoryExample example);

    int deleteByPrimaryKey(Integer repertoryid);

    int insert(Repertory record);

    int insertSelective(Repertory record);

    List<Repertory> selectByExample(RepertoryExample example);

    Repertory selectByPrimaryKey(Integer repertoryid);

    int updateByExampleSelective(@Param("record") Repertory record, @Param("example") RepertoryExample example);

    int updateByExample(@Param("record") Repertory record, @Param("example") RepertoryExample example);

    int updateByPrimaryKeySelective(Repertory record);

    int updateByPrimaryKey(Repertory record);
}