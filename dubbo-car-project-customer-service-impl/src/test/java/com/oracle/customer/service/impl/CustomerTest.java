package com.oracle.customer.service.impl;

import com.oracle.customer.service.api.CustomerServiceApi;
import com.oracle.pojo.Customer;
import com.oracle.pojo.vo.CustomerVo;
import com.oracle.pojo.vo.Page;
import com.sun.org.apache.xml.internal.serializer.ToUnknownStream;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author HuangHaoD
 * @create 2022/08/22 15:55
 */
public class CustomerTest extends BaseTest{

    @Autowired
    private CustomerServiceApi customerServiceApi;

    @Test
    public void testGetAll(){
        Page<List<CustomerVo>> customerList = this.customerServiceApi.getCustomerList(1, 5);
        System.out.println(customerList);
    }


    @Test
    public void testGetById(){
        CustomerVo byId = this.customerServiceApi.findById(4);
        System.out.println(byId);
    }


    @Test
    public  void testAdd(){
        CustomerVo customer=new CustomerVo();
        customer.setCompanyid(1);
        customer.setCustomername("刺客");
        customer.setCustomerphone("13567890871");
        customer.setCustomersex("男");
        customer.setCustomertype("2");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String date="1998-11-17";
        try {
            Date parse = simpleDateFormat.parse(date);
            customer.setCustomerbirthday(parse);
            this.customerServiceApi.insertCustomer(customer);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testUpdate(){
        CustomerVo customer=new CustomerVo();
        customer.setCustomerid(15);
        customer.setCompanyid(1);
        customer.setCustomername("刺客小陈");
        customer.setCustomerphone("13567890871");
        customer.setCustomersex("男");
        customer.setCustomertype("2");
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String date="1998-10-11";
        try {
            Date parse = simpleDateFormat.parse(date);
            customer.setCustomerbirthday(parse);
            this.customerServiceApi.updateCustomer(customer);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }



}