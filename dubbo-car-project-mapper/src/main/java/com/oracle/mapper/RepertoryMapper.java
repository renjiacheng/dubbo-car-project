package com.oracle.mapper;

import com.oracle.pojo.Repertory;
import com.oracle.pojo.RepertoryExample;
import java.util.List;

import com.oracle.pojo.vo.RepertoryBo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

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

    @Select("select r.repertoryId,c.carName,comp.companyName,r.purchasePrice,r.inTime,r.repertoryNum from repertory r\n" +
            "left join car c on c.carId=r.carId\n" +
            "left join company comp on r.companyId=comp.companyId")
    List<RepertoryBo> findallRepertory();
}