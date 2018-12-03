package com.draper.system.dao;

import com.draper.system.entity.RolePermissionRelation;
import com.draper.system.entity.UserRoleRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolePermissionRelationMapper {

    /**
     * 连接角色与权限之间的关系
     *
     * @param relation
     */
    void correlate(RolePermissionRelation relation);

    /**
     * 删除角色与权限之间的关系
     *
     * @param roleId
     * @param permissionId
     */
    void unCorrelate(@Param("roleId") long roleId, @Param("permissionId") long permissionId);

    /**
     * 查找角色的所有权限
     *
     * @param roleId
     * @return
     */
    List<RolePermissionRelation> selectRolePermission(long roleId);

    /**
     * 查找拥有该权限的所有角色
     *
     * @param roleId
     * @return
     */
    List<UserRoleRelation> selectPermissionsFromRole(long roleId);

}
