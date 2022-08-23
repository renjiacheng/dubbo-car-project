package com.oracle.mapper;

import com.oracle.pojo.Carorder;
import com.oracle.pojo.CarorderExample;
import java.util.List;

import com.oracle.pojo.vo.CarOrderNumVo;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface CarorderMapper {
    int countByExample(CarorderExample example);

    int deleteByExample(CarorderExample example);

    int deleteByPrimaryKey(Integer orderid);

    int insert(Carorder record);

    int insertSelective(Carorder record);

    List<Carorder> selectByExample(CarorderExample example);

    Carorder selectByPrimaryKey(Integer orderid);

    int updateByExampleSelective(@Param("record") Carorder record, @Param("example") CarorderExample example);

    int updateByExample(@Param("record") Carorder record, @Param("example") CarorderExample example);

    int updateByPrimaryKeySelective(Carorder record);

    int updateByPrimaryKey(Carorder record);

    @Select("select  a.carName,sum(m.orderNum) from carorder m \n" +
            "            inner join car a on m.carid=a.carid\n" +
            "\t\t\t\t\t\tGROUP BY a.carName")
    List<CarOrderNumVo> selectAll();
}