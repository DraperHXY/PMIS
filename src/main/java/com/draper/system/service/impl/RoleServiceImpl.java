package com.draper.system.service.impl;

import com.draper.system.service.RoleService;

import javax.management.relation.Role;

public class RoleServiceImpl implements RoleService {
    @Override
    public Role createRole(Role role) {
        return null;
    }

    @Override
    public void deleteRole(Long roleId) {

    }

    @Override
    public void correlationPermissions(Long roleId, Long... permissionIds) {

    }

    @Override
    public void uncorrelationPermissions(Long roleId, Long... permissionIds) {

    }
}
