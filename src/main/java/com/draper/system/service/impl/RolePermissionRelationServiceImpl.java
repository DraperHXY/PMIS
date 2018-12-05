package com.draper.system.service.impl;


import com.draper.system.dao.RolePermissionRelationMapper;
import com.draper.system.entity.RolePermissionRelation;
import com.draper.system.entity.UserRoleRelation;
import com.draper.system.service.RolePermissionRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolePermissionRelationServiceImpl implements RolePermissionRelationService {

    @Autowired
    private RolePermissionRelationMapper rolePermissionRelationMapper;


    @Override
    public void correlate(RolePermissionRelation relation) {

    }

    @Override
    public void unCorrelate(long roleId, long permissionId) {

    }

    @Override
    public List<RolePermissionRelation> selectRolePermission(long roleId) {
        return rolePermissionRelationMapper.selectRolePermission(roleId);
    }

    @Override
    public List<UserRoleRelation> selectPermissionsFromRole(long roleId) {
        return rolePermissionRelationMapper.selectPermissionsFromRole(roleId);
    }
}
