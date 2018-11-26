package com.draper.system.dao;

import com.draper.system.entity.Employee;

import java.util.List;

public interface EmployeeMapper {

    /**
     * 插入 employee
     *
     * @param employee
     */
    void insert(Employee employee);

    /**
     * 查找所有 employee
     *
     * @return
     */
    List<Employee> selectAll();

    /**
     * 查找当前 id 最大的值
     *
     * @return
     */
    long selectMaxId();

    /**
     * 通过 workId 查找 employee
     *
     * @param workId
     * @return
     */
    Employee selectByWorkId(long workId);

}
