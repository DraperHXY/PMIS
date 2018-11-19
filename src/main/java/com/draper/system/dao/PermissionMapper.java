package com.draper.system.dao;

import com.draper.system.entity.Permission;

public interface PermissionMapper {

    Permission createPermission(Permission permission);

    void deletePermission(long permissionId);

}
