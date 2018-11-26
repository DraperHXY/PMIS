package com.draper.system.dao;

import com.draper.system.entity.Role;

public interface RoleMapper {

    /**
     * 插入 role
     *
     * @param role
     */
    void insertRole(Role role);

    /**
     * 通过 id 删除 role
     *
     * @param id
     * @deprecated 使用之前确保 user_role 表中没有这个 role。
     * 可以通过新增角色，修改 user_role 来保证数据的完整性。
     */
    void deleteRole(long id);

    /**
     * 通过 name 查找 id
     *
     * @param name
     * @return
     */
    long selectIdByName(String name);

    /**
     * 通过 id 查找 role
     *
     * @param id
     * @return
     */
    Role selectRole(long id);

    // FIXME: 2018/11/21 该功能呢应该交给 RolePermissionMapper
    void correlationPermissions(long userId, long... permissionIds);

    // FIXME: 2018/11/21 该功能呢应该交给 RolePermissionMapper
    void uncorrelationPermissions(long userId, long... permissionIds);

    // FIXME: 2018/11/21 该功能呢应该交给 RolePermissionMapper
    int exists();

}
