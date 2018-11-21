package com.draper.system.dao;

import com.draper.system.entity.Role;

public interface RoleMapper {

    /**
     * 插入角色
     *
     * @param role
     */
    void insertRole(Role role);

    /**
     * 删除角色
     *
     * @param id
     * @deprecated 尽可能避免使用这个方法，使用之前确保 user_role 表中没有这个 role。
     * 可以通过新增角色，修改 user_role 来保证数据的完整性。
     */
    void deleteRole(long id);

    /**
     * 通过角色名查找 id
     *
     * @param name
     * @return
     */
    long selectIdByName(String name);

    /**
     * 通过 id 查找角色
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
