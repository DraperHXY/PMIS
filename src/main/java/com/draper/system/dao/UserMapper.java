package com.draper.system.dao;

import com.draper.system.entity.User;

import java.util.List;

public interface UserMapper {

    void insertUser(User user);

    User selectUserByAccount(String account);

    User selectUserByWorkId(long workId);

    void correlationRoles();

    void uncorrelationRoles();

    /**
     * 用户拥有的角色
     */
    List<String> selectRoles(long userId);

    /**
     * 用户拥有的权限
     *
     * @param userId
     * @return
     */
    List<String> selectPermissions(long userId);

}
