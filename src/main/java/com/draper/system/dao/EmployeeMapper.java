package com.draper.system.dao;

import com.draper.system.entity.Employee;

import java.util.List;

public interface EmployeeMapper {

    void insert(Employee employee);

    List<Employee> selectAll();

    long selectMaxId();

    Employee selectByWorkId(long workId);

}
