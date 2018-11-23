package com.draper.system.dao;

import com.draper.system.entity.Department;
import com.draper.system.entity.Person;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {

    void insert(Department department);

    List<Department> selectAll();

    List<Department> selectByKey(@Param("key") String key, @Param("value") Object value);

    void modifyByKey(@Param("modifyKey") String modifyKey,
                     @Param("modifyValue") Object modifyValue,
                     @Param("findKey") String findKey,
                     @Param("findValue") Object value);

    void delete(long id);

}
