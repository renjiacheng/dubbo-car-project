package com.oracle.finance.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.oracle.finance.service.api.FinanceServiceApi;
import com.oracle.mapper.FinancingMapper;
import com.oracle.pojo.Financing;
import com.oracle.pojo.FinancingExample;
import com.oracle.pojo.vo.FinancingVo;
import com.oracle.pojo.vo.Page;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author rjc
 * @create 2022-08-22 17:02
 */
@Service
public class FinanceService implements FinanceServiceApi {

    @Autowired
    private FinancingMapper financingMapper;

    @Override
    public Page<List<FinancingVo>> getFinanceList(Integer pageNum, Integer pageSize) {
        com.github.pagehelper.Page<Object> page = PageHelper.startPage(pageNum, pageSize);
        List<FinancingVo> financingList = financingMapper.getFinancingList();
        Page<List<FinancingVo>> pageInfo = new Page<>();
        pageInfo.setPageNums(pageNum);
        pageInfo.setPageSize(pageSize);
        pageInfo.setTotalPage(page.getPages());
        pageInfo.setAllRow(page.getTotal());
        //po对象转为vo对象
        List<FinancingVo> financingVoList = page.getResult().stream().map((financingPo) -> {
            FinancingVo financingVo = new FinancingVo();
            BeanUtils.copyProperties(financingPo, financingVo);
            return financingVo;
        }).collect(Collectors.toList());
        //将转好的集合存到Page对象中
        pageInfo.setData(financingVoList);
        return pageInfo;
    }

    @Override
    public int addFinance(FinancingVo financingVo) {
        Financing financingPo = new Financing();
        BeanUtils.copyProperties(financingVo, financingPo);
        return financingMapper.insert(financingPo);

    }

    @Override
    public int updateFinance(FinancingVo financingVo) {
        Financing financingPo = new Financing();
        BeanUtils.copyProperties(financingVo, financingPo);
        return financingMapper.updateByPrimaryKey(financingPo);
    }

    @Override
    public int deleteFinanceById(Integer id) {
        return financingMapper.deleteByPrimaryKey(id);
    }

    @Override
    public FinancingVo getFinanceById(Integer id) {
        Financing financingPo = financingMapper.selectByPrimaryKey(id);
        FinancingVo financingVo = new FinancingVo();
        BeanUtils.copyProperties(financingPo, financingVo);
        return financingVo;
    }

    @Override
    public List<FinancingVo> getFinanceListByType(String financingType) {
        FinancingExample financingExample=new FinancingExample();
        FinancingExample.Criteria criteria = financingExample.createCriteria();
        criteria.andFinancingtypeEqualTo(financingType);
        List<Financing> financingList = financingMapper.selectByExample(financingExample);
        List<FinancingVo> financingVoList = financingList.stream().map((financingPo) -> {
            FinancingVo financingVo = new FinancingVo();
            BeanUtils.copyProperties(financingPo, financingVo);
            return financingVo;
        }).collect(Collectors.toList());
        return financingVoList;
    }
}
