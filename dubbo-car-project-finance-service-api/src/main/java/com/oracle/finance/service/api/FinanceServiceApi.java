package com.oracle.finance.service.api;

import com.oracle.pojo.vo.FinancingVo;
import com.oracle.pojo.vo.Page;

import java.util.List;

/**
 * @author rjc
 * @create 2022-08-22 15:54
 */
public interface FinanceServiceApi {
    //以分页的形式显示财务表(finance)
    Page<List<FinancingVo>> getFinanceList(Integer pageNum, Integer pageSize);

    //添加财务表
    int addFinance(FinancingVo financingVo);

    //更新财务表
    int updateFinance(FinancingVo financingVo);

    //删除财务表
    int deleteFinanceById(Integer id);

    //按照id查询信息
    FinancingVo getFinanceById(Integer id);

    //查询全部支出的财务
    List<FinancingVo> getFinanceListByType(String financingType);
}
