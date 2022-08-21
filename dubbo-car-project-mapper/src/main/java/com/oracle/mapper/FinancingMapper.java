package com.oracle.mapper;

import com.oracle.pojo.Financing;
import com.oracle.pojo.FinancingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FinancingMapper {
    int countByExample(FinancingExample example);

    int deleteByExample(FinancingExample example);

    int deleteByPrimaryKey(Integer financingid);

    int insert(Financing record);

    int insertSelective(Financing record);

    List<Financing> selectByExample(FinancingExample example);

    Financing selectByPrimaryKey(Integer financingid);

    int updateByExampleSelective(@Param("record") Financing record, @Param("example") FinancingExample example);

    int updateByExample(@Param("record") Financing record, @Param("example") FinancingExample example);

    int updateByPrimaryKeySelective(Financing record);

    int updateByPrimaryKey(Financing record);
}