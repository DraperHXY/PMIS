package com.draper.system.service.impl;

import com.draper.system.dao.DepartmentMapper;
import com.draper.system.entity.Department;
import com.draper.system.service.DepartmentSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentSerivce {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public void createDepartment(Department department) {
        department.setCreateAt(System.currentTimeMillis());
        department.setUpdateAt(System.currentTimeMillis());
        departmentMapper.insert(department);
    }

    @Override
    public List<Department> findAll() {
        return departmentMapper.selectAll();
    }

}
