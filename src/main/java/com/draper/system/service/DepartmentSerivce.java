package com.draper.system.service;

import com.draper.system.entity.Department;

import java.util.List;

public interface DepartmentSerivce {

    void createDepartment(Department department);

    List<Department> findAll();
}
