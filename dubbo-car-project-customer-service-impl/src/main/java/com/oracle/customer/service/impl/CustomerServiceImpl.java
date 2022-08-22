package com.oracle.customer.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.oracle.customer.service.api.CustomerServiceApi;
import com.oracle.mapper.CustomerMapper;
import com.oracle.pojo.Customer;
import com.oracle.pojo.vo.CustomerVo;
import com.oracle.pojo.vo.Page;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author HuangHaoD
 * @create 2022/08/22 15:44
 */
@Service
public class CustomerServiceImpl implements CustomerServiceApi {

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public Page<List<CustomerVo>> getCustomerList(Integer pageNum, Integer pageSize) {
        com.github.pagehelper.Page<Customer> page = PageHelper.startPage(pageNum, pageSize);
        this.customerMapper.selectByExample(null);
        List<CustomerVo> customerVoList = page.getResult().stream().map(customer -> {
            CustomerVo customerVo = new CustomerVo();
            BeanUtils.copyProperties(customer, customerVo);
            return customerVo;
        }).collect(Collectors.toList());
        Page pageInfo=new Page(pageNum,pageSize,page.getTotal(),page.getPages(),customerVoList);
        return pageInfo;
    }

    @Override
    public void insertCustomer(CustomerVo customerVo) {
        Customer customer=new Customer();
        BeanUtils.copyProperties(customerVo,customer);
        this.customerMapper.insert(customer);
    }

    @Override
    public void updateCustomer(CustomerVo customerVo) {
        Customer customer=new Customer();
        BeanUtils.copyProperties(customerVo,customer);
        this.customerMapper.updateByPrimaryKey(customer);
    }

    @Override
    public void deleteById(Integer id) {
        this.deleteById(id);
    }

    @Override
    public CustomerVo findById(Integer id) {
        Customer customer = this.customerMapper.selectByPrimaryKey(id);
        CustomerVo customerVo=new CustomerVo();
        BeanUtils.copyProperties(customer,customerVo);
        return customerVo;
    }
}