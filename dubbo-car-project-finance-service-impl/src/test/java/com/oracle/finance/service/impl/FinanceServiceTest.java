package com.oracle.finance.service.impl;

import com.oracle.finance.service.api.FinanceServiceApi;
import com.oracle.pojo.vo.FinancingVo;
import com.oracle.pojo.vo.Page;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author rjc
 * @create 2022-08-22 17:14
 */
public class FinanceServiceTest extends BaseTest {
    @Autowired(required = false)
    private FinanceServiceApi financeServiceApi;

    @Test
    public void getList(){
        Page<List<FinancingVo>> financeList = financeServiceApi.getFinanceList(1, 2);
        List<FinancingVo> data = financeList.getData();

    }

    @Test
    public void add(){
        FinancingVo financingVo=new FinancingVo();
        financingVo.setFinancingid(4);
        financingVo.setSaleid(null);
        financingVo.setRepertoryid(1);
        financingVo.setCompanyid(2);
        financingVo.setFinancingmoney(new BigDecimal(120000));
        financingVo.setFinancingtype("1");
        financingVo.setFinancingtime(new Date());
        financeServiceApi.addFinance(financingVo);
    }

    @Test
    public void update(){
        FinancingVo financingVo=new FinancingVo();
        financingVo.setFinancingid(4);
        financingVo.setSaleid(null);
        financingVo.setRepertoryid(1);
        financingVo.setCompanyid(2);
        financingVo.setFinancingmoney(new BigDecimal(1200));
        financingVo.setFinancingtype("2");
        financingVo.setFinancingtime(new Date());
        financeServiceApi.updateFinance(financingVo);
    }

    @Test
    public void delete(){
        financeServiceApi.getFinanceById(4);
    }

    @Test
    public void getById(){
        FinancingVo financeById = financeServiceApi.getFinanceById(4);
        System.out.println(financeById);
    }

    @Test
    public void getFinancingByType(){
        financeServiceApi.getFinanceListByType(2+"");
    }
}
