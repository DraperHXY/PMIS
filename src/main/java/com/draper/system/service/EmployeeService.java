package com.draper.system.service;

import com.draper.system.entity.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    List<Employee> findAll();

    long findDefaultWorkId();

    boolean create(Map<String, String> parameterMap);

    Employee findByWorkId(long workId);

}
