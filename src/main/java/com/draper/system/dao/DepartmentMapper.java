package com.draper.system.dao;

import com.draper.system.entity.Department;

import java.util.List;

public interface DepartmentMapper {

    void insert(Department department);

    List<Department> selectAll();

}
