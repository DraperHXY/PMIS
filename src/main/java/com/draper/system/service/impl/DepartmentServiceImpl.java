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
    public Department find(long id) {
        return departmentMapper.selectByKey("id", id).get(0);
    }

    @Override
    public List<Department> findAll() {
        return departmentMapper.selectAll();
    }

    @Override
    public List<Department> findListById() {
        return null;
    }

    @Override
    public boolean modifyName(String nameValue, long id) {
        try {
            departmentMapper.modifyByKey("name", nameValue, "id", id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean modifyFromDepartmentId(long fromDepartmentIdValue, long id) {
        try {
            departmentMapper.modifyByKey("from_department_id", fromDepartmentIdValue, "id", id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean modifyDepartmentLeaderId(long departmentLeaderId, long id) {
        try {
            departmentMapper.modifyByKey("department_leader_id", departmentLeaderId, "id", id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean modifyKeyById(String key, String value, long id) {
        boolean isModify = true;

        try {
            switch (key) {
                case "name":
                    departmentMapper.modifyByKey("name", value, "id", id);
                    break;
                case "fromDepartmentId":
                    departmentMapper.modifyByKey("from_department_id", value, "id", id);
                    break;
                case "departmentLeaderId":
                    departmentMapper.modifyByKey("department_leader_id", value, "id", id);
                    break;
                case "departmentPhone":
                    departmentMapper.modifyByKey("department_phone", value, "id", id);
                    break;
                case "office":
                    departmentMapper.modifyByKey("office", value, "id", id);
                    break;
                case "note":
                    departmentMapper.modifyByKey("note", value, "id", id);
                    break;
                default:
                    isModify = false;
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
            isModify = false;
            return isModify;
        }

        return isModify;
    }

    @Override
    public boolean delete(long id) {
        boolean isDelete = false;
        try {
            departmentMapper.delete(id);
            isDelete = true;
        } catch (Exception e) {
            isDelete = false;
        }
        return isDelete;
    }

}