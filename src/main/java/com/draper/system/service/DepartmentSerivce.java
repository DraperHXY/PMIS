package com.draper.system.service;

import com.draper.system.entity.Department;

import java.util.List;

public interface DepartmentSerivce {

    /**
     * 创建 department
     *
     * @param department
     */
    void createDepartment(Department department);

    /**
     * 通过 id 查找 department
     *
     * @param id
     * @return
     */
    Department find(long id);

    /**
     * 查找所有 department
     *
     * @return
     */
    List<Department> findAll();

    List<Department> findListById();

    /**
     * 通过 id 修改 name
     *
     * @param nameValue
     * @param id
     * @return
     */
    boolean modifyName(String nameValue, long id);

    /**
     * 通过 id 修改 fromDepartmentId
     *
     * @param fromDepartmentIdValue
     * @param id
     * @return
     */
    boolean modifyFromDepartmentId(long fromDepartmentIdValue, long id);

    /**
     * 通过 id 修改 departmentLeaderId
     *
     * @return
     */
    boolean modifyDepartmentLeaderId(long departmentLeaderId, long id);

    /**
     * 通过 id 来修改 key 的 value
     *
     * @param key
     * @param value
     * @param id
     * @return
     */
    boolean modifyKeyById(String key, String value, long id);

    boolean delete(long id);

}
