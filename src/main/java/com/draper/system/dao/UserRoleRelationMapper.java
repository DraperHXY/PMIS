package com.draper.system.dao;

import com.draper.system.entity.UserRoleRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserRoleRelationMapper {

    /**
     * 连接用户与角色之间的关系
     *
     * @param relation
     */
    void correlate(UserRoleRelation relation);

    /**
     * 删除用户与角色之间的关系
     *
     * @param userId
     * @param roleId
     */
    void unCorrelate(@Param("userId") long userId, @Param("roleId") long roleId);

    /**
     * 查找用户的所有角色
     *
     * @param userId
     * @return
     */
    List<UserRoleRelation> selectUserRoles(long userId);

    /**
     * 查找拥有该角色的所有用户
     *
     * @param roleId
     * @return
     */
    List<UserRoleRelation> selectUsersFromRole(long roleId);

}
