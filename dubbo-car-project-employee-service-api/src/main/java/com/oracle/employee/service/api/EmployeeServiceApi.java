package com.oracle.employee.service.api;

import com.oracle.pojo.vo.EmployeeVo;
import com.oracle.pojo.vo.Page;

import java.util.List;

/**
 * @author rjc
 * @create 2022-08-22 13:40
 */
public interface EmployeeServiceApi {

   //以分页的方式展示全部员工信息
    Page<List<EmployeeVo>> getEmployeeListPage(Integer pageNumber, Integer pageSize);

    //添加员工信息
    int addEmployee(EmployeeVo employeeVo);

    //修改员工信息
    int updateEmployee(EmployeeVo employeeVo);

    //逻辑方式删除员工信息
    int logicDeleteEmployeeById(Integer id);

    //物理删除
    int deleteEmployeeById(Integer id);

    //根据id查询用户
   EmployeeVo getEmployeeById(Integer id);
}
