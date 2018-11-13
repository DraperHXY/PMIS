package com.draper.dao;

import com.draper.entity.User;

public interface UserDao {

    void insertUser(User user);

        User selectUserByAccount(String account);

    User selectUserByWorkId(long id);



}
