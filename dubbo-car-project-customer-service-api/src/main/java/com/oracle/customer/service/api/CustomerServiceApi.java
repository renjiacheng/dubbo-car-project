package com.oracle.customer.service.api;

import com.oracle.pojo.vo.CustomerVo;
import com.oracle.pojo.vo.Page;

import java.util.List;

/**
 * @author HuangHaoD
 * @create 2022/08/22 15:28
 */
public interface CustomerServiceApi {

    Page<List<CustomerVo>> getCustomerList(Integer pageNum,Integer pageSize);

    void insertCustomer(CustomerVo customerVo);

    void updateCustomer(CustomerVo customerVo);

    void deleteById(Integer id);

    CustomerVo findById(Integer id);

}