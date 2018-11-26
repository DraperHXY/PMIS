package com.draper.system.dao;

import com.draper.system.entity.Permission;

import java.util.List;

public interface PermissionMapper {

    void insert(Permission permission);

    List<Permission> selectAll();

    Permission createPermission(Permission permission);

    /**
     * 通过 id 删除 permission
     *
     * @param id
     * @deprecated 使用之前确保 role_permission 中没有这个 permission
     */
    void deletePermission(long id);

}
