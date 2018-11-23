package com.draper.system.dao;

import com.draper.system.entity.Person;
import org.apache.ibatis.annotations.Param;

public interface PersonMapper {

    /**
     * 创建 person
     *
     * @param person
     */
    void insert(Person person);

    /**
     * 通过 id 查找 person
     *
     * @param id
     * @return
     */
    Person select(long id);

    /**
     * 通过 key 的 value 来查找 Person
     *
     * @param key
     * @param value
     * @return
     */
    Person selectByKey(@Param("key") String key, @Param("value") Object value);

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
     * 通过 id 来删除 person
     * @param id
     */
    void delete(long id);

}
