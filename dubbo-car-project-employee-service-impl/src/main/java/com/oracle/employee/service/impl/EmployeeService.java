package com.oracle.employee.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.oracle.employee.service.api.EmployeeServiceApi;
import com.oracle.mapper.EmployeeMapper;
import com.oracle.pojo.Employee;
import com.oracle.pojo.vo.EmployeeVo;
import com.oracle.pojo.vo.Page;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author rjc
 * @create 2022-08-22 13:55
 */
@Service
public class EmployeeService implements EmployeeServiceApi {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public Page<List<EmployeeVo>> getEmployeeListPage(Integer pageNumber, Integer pageSize) {
        com.github.pagehelper.Page<Object> page = PageHelper.startPage(pageNumber, pageSize);
        //调用mapper查询数据库全部信息
        List<Employee> employees = employeeMapper.getEmployeeList();
        Page<List<EmployeeVo>> pageInfo = new Page<>();
        pageInfo.setPageNums(pageNumber);
        pageInfo.setPageSize(pageSize);
        pageInfo.setTotalPage(page.getPages());
        pageInfo.setAllRow(page.getTotal());
        //po对象转为vo对象
        List<EmployeeVo> employeeVoList = page.getResult().stream().map((EmployeePo) -> {
            EmployeeVo employeeVo = new EmployeeVo();
            BeanUtils.copyProperties(EmployeePo, employeeVo);
            return employeeVo;
        }).collect(Collectors.toList());
        //将转好的集合存到Page对象中
        pageInfo.setData(employeeVoList);
        return pageInfo;
    }

    @Override
    public int addEmployee(EmployeeVo employeeVo) {
        Employee employeePo = new Employee();
        BeanUtils.copyProperties(employeeVo, employeePo);
        return employeeMapper.insert(employeePo);

    }

    @Override
    public int updateEmployee(EmployeeVo employeeVo) {
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeVo, employee);
     return employeeMapper.updateByPrimaryKey(employee) ;
    }

    @Override
    public int logicDeleteEmployeeById(Integer id) {
        return 0;
    }

    @Override
    public int deleteEmployeeById(Integer id) {
     return employeeMapper.deleteByPrimaryKey(id) ;
    }

    @Override
    public EmployeeVo getEmployeeById(Integer id) {
        Employee employee = employeeMapper.selectByPrimaryKey(id);
        EmployeeVo employeeVo = new EmployeeVo();
        BeanUtils.copyProperties(employee, employeeVo);
        return employeeVo;
    }
}
