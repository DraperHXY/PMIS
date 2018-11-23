package com.draper.system.service.impl;

import com.draper.system.dao.PersonMapper;
import com.draper.system.entity.Person;
import com.draper.system.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public Person create(Person person) {
        person.setCreateAt(System.currentTimeMillis());
        person.setUpdateAt(System.currentTimeMillis());
        personMapper.insert(person);
        return person;
    }

    @Override
    public Person find(long id) {
        return personMapper.select(id);
    }

    @Override
    public Person findByWorkId(long workId) {
        return personMapper.selectByKey("work_id", workId);
    }

    @Override
    public Person findByName(String name) {
        return personMapper.selectByKey("name", name);
    }

    @Override
    public Person findByPersonId(String personId) {
        return personMapper.selectByKey("person_id", personId);
    }

    @Override
    public boolean modifyNameById(String nameValue, long id) {
        personMapper.modifyByKey("name", nameValue, "id", id);
        return true;
    }

    @Override
    public boolean modifyAddressById(String addressValue, long id) {
        personMapper.modifyByKey("address", addressValue, "id", id);
        return true;
    }

    @Override
    public boolean modifyEmailById(String emailValue, long id) {
        personMapper.modifyByKey("email", emailValue, "id", id);
        return true;
    }

    @Override
    public boolean modifyNoteById(String note, long id) {
        personMapper.modifyByKey("note", note, "id", id);
        return true;
    }

}
