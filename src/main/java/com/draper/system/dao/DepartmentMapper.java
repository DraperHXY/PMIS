package com.draper.system.dao;

import com.draper.system.entity.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {

    /**
     * 插入 department
     *
     * @param department
     */
    void insert(Department department);

    /**
     * 查找所有 department
     *
     * @return
     */
    List<Department> selectAll();

    /**
     * 通过 db 中 key 的 value 来查找 department
     *
     * @param key
     * @param value
     * @return
     */
    List<Department> selectByKey(@Param("key") String key, @Param("value") Object value);

    /**
     * 通过 findKey 的 value 来修改 modifyKey 的 modifyValue
     *
     * @param modifyKey
     * @param modifyValue
     * @param findKey
     * @param value
     */
    void modifyByKey(@Param("modifyKey") String modifyKey,
                     @Param("modifyValue") Object modifyValue,
                     @Param("findKey") String findKey,
                     @Param("findValue") Object value);

    /**
     * 通过 id 来删除 department
     *
     * @param id
     */
    void delete(long id);

}
