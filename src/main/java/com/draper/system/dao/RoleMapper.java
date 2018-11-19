package com.draper.system.dao;

import com.draper.system.entity.Role;

public interface RoleMapper {

    void insertRole(Role role);

    void deleteRole(long roleId);

    void correlationPermissions(long userId, long... permissionIds);

    void uncorrelationPermissions(long userId, long... permissionIds);

    int exists();

}
