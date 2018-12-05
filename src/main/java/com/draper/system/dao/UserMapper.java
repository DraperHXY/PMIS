package com.draper.system.dao;

import com.draper.system.entity.User;

import java.util.List;

public interface UserMapper {

    /**
     * 插入 user
     *
     * @param user
     */
    void insert(User user);

    /**
     * 通过 account 来查找用户
     *
     * @param account
     * @return
     */
    User selectUserByAccount(String account);

    /**
     * 通过 workId 来查找 user
     *
     * @param workId
     * @return
     */
    User selectUserByWorkId(long workId);

    /**
     * 通过 id 查找 user
     *
     * @return
     */
    User selectUser(long id);

    /**
     * 查找 user 拥有的 role
     */
    // FIXME: 2018/11/21 该功能应该交给 UserRoleRelationMapper
    List<String> selectRoles(long userId);

    /**
     * user 拥有的 permission
     *
     * @param userId
     * @return
     */
    // FIXME: 2018/11/21 该功能应该交给 UserRoleRelationMapper
    List<String> selectPermissions(long userId);

    List<Long> selectAllWorkId();

    List<User> selectAll();

}
