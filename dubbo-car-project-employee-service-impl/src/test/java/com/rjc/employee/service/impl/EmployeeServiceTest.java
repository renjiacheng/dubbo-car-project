package com.rjc.employee.service.impl;

import com.oracle.employee.service.api.EmployeeServiceApi;
import com.oracle.pojo.vo.EmployeeVo;
import com.oracle.pojo.vo.Page;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author rjc
 * @create 2022-08-22 14:50
 */
public class EmployeeServiceTest extends BaseTest {
    @Autowired(required = false)
    private EmployeeServiceApi employeeServiceApi;

    @Test
    public void getListPage(){
        Page<List<EmployeeVo>> employeeListPage = employeeServiceApi.getEmployeeListPage(1, 5);
        List<EmployeeVo> data = employeeListPage.getData();
        for (EmployeeVo datum : data) {
            System.out.println(datum);
        }
    }
    @Test
    public void addEmployee(){
        EmployeeVo employeeVo=new EmployeeVo();
        employeeVo.setEmpid(9);
        employeeVo.setPositionid(1);
        employeeVo.setCompanyid(4);
        employeeVo.setEmpname("马铁");
        employeeVo.setEmpphone("1388888888");
        employeeVo.setEmppassword("123");
        employeeVo.setEmpsalery(new BigDecimal(2000));
        int i = employeeServiceApi.addEmployee(employeeVo);
        System.out.println(i);
    }
    @Test
    public void updateEmployee(){
        EmployeeVo employeeVo=new EmployeeVo();
        employeeVo.setEmpid(9);
        employeeVo.setPositionid(1);
        employeeVo.setCompanyid(4);
        employeeVo.setEmpname("马铁");
        employeeVo.setEmpphone("1388888888");
        employeeVo.setEmppassword("123");
        employeeVo.setEmpsalery(new BigDecimal(25000));
        employeeServiceApi.updateEmployee(employeeVo);
    }

    @Test
    public void deleteEmployee(){
        employeeServiceApi.deleteEmployeeById(9);
    }

    @Test
    public void getEmployeeById(){
        EmployeeVo employeeById = employeeServiceApi.getEmployeeById(9);
        System.out.println(employeeById);
    }
}
