package com.draper.system.service;

import com.draper.system.entity.Person;

public interface PersonService {

    /**
     * 创建个人信息
     *
     * @param person
     * @return
     */
    Person create(Person person);

    /**
     * 通过 id 查找 person
     *
     * @param id
     * @return
     */
    Person find(long id);

    /**
     * 通过 workId {@link Person#workId} 查找 Person
     *
     * @param workId
     * @return
     */
    Person findByWorkId(long workId);

    /**
     * 通过 name 查找 person
     *
     * @param name
     * @return
     */
    Person findByName(String name);

    /**
     * 通过 personId {@link Person#personId} 查找 Person
     *
     * @param personId
     * @return
     */
    Person findByPersonId(String personId);

    /**
     * 修改指定 id 的 name
     *
     * @param nameValue
     * @param id
     * @return
     */
    boolean modifyNameById(String nameValue, long id);

    /**
     * 修改指定 id 的 address
     *
     * @param addressValue
     * @param id
     * @return
     */
    boolean modifyAddressById(String addressValue, long id);

    /**
     * 修改指定 id 的 email
     *
     * @param emailValue
     * @param id
     * @return
     */
    boolean modifyEmailById(String emailValue, long id);

    /**
     * 修改指定 id 的 note {@link Person#note}
     *
     * @param note
     * @param id
     * @return
     */
    boolean modifyNoteById(String note, long id);

}
