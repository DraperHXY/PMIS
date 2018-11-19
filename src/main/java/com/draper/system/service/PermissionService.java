package com.draper.system.service;


import com.draper.system.entity.Permission;

public interface PermissionService {

    Permission createPermission(Permission permission);

    void deletePermission(Long permissionId);

}
