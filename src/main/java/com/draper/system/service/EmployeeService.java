package com.draper.system.service;

import com.draper.system.entity.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {

    /**
     * 查找所有 employee
     *
     * @return
     */
    List<Employee> findAll();

    /**
     * 查找最大的 workId
     *
     * @return
     */
    long findDefaultWorkId();

    /**
     * 通过 request 的参数来创建 employee
     *
     * @param parameterMap
     * @return
     */
    boolean create(Map<String, String> parameterMap);

    /**
     * 通过 workId 来查找 employee
     *
     * @param workId
     * @return
     */
    Employee findByWorkId(long workId);

}
