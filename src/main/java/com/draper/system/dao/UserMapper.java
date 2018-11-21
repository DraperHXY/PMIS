package com.draper.system.dao;

import com.draper.system.entity.User;

import java.util.List;

public interface UserMapper {

    /**
     * 插入用户
     *
     * @param user
     */
    void insertUser(User user);

    /**
     * 通过 account 来查找用户
     *
     * @param account
     * @return
     */
    User selectUserByAccount(String account);

    /**
     * 通过 workId 来查找用户
     *
     * @param workId
     * @return
     */
    User selectUserByWorkId(long workId);

    /**
     * 通过 id 查找用户
     *
     * @return
     */
    User selectUser(long id);

    /**
     * 用户拥有的角色
     */
    // FIXME: 2018/11/21 该功能应该交给 UserRoleRelationMapper
    List<String> selectRoles(long userId);

    /**
     * 用户拥有的权限
     *
     * @param userId
     * @return
     */
    // FIXME: 2018/11/21 该功能应该交给 UserRoleRelationMapper
    List<String> selectPermissions(long userId);

}
