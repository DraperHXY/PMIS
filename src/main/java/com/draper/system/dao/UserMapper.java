package com.draper.system.dao;

import com.draper.system.entity.User;

public interface UserMapper {

    void insertUser(User user);

    User selectUserByAccount(String account);

    User selectUserByWorkId(long workId);

}
