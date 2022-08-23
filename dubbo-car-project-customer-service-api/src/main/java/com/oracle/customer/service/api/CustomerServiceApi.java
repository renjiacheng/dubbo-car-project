package com.oracle.customer.service.api;

import com.oracle.pojo.vo.CustomerVo;
import com.oracle.pojo.vo.Page;

import java.util.List;

/**
 * @author HuangHaoD
 * @create 2022/08/22 15:28
 */
public interface CustomerServiceApi {
    /**
     * 分页查询所有的客户信息
     * @author HuangHaoD
     * @date 2022/8/23 9:20
     * @param pageNum
     * @param pageSize
     * @return com.oracle.pojo.vo.Page<java.util.List<com.oracle.pojo.vo.CustomerVo>>
     */
    Page<List<CustomerVo>> getCustomerList(Integer pageNum,Integer pageSize);
    /**
     * 插入客户的信息
     * @author HuangHaoD
     * @date 2022/8/23 9:21
     * @param customerVo
     */
    void insertCustomer(CustomerVo customerVo);
    /**
     * 修改客户的信息
     * @author HuangHaoD
     * @date 2022/8/23 9:21
     * @param customerVo
     */
    void updateCustomer(CustomerVo customerVo);
    /**
     * 删除客户的信息
     * @author HuangHaoD
     * @date 2022/8/23 9:21
     * @param id
     */
    void deleteById(Integer id);
    /**
     * 查询指定客户的信息
     * @author HuangHaoD
     * @date 2022/8/23 9:21
     * @param id
     * @return com.oracle.pojo.vo.CustomerVo
     */
    CustomerVo findById(Integer id);

}