package com.draper.system.service;

import com.draper.system.entity.UserRoleRelation;

import java.util.List;

public interface UserRoleRelationService {

    /**
     * 连接 user 与 role 之间的关系
     *
     * @param relation
     */
    void correlate(UserRoleRelation relation);

    /**
     * 删除 user 与 role 之间的关系
     *
     * @param userId
     * @param roleId
     */
    void unCorrelate(long userId, long roleId);

    /**
     * 查找 user 的所有 role
     *
     * @param userId
     * @return
     */
    List<UserRoleRelation> selectUserRoles(long userId);

    /**
     * 查找拥有该 role 的所有 user
     *
     * @param roleId
     * @return
     */
    List<UserRoleRelation> selectUsersFromRole(long roleId);

}
