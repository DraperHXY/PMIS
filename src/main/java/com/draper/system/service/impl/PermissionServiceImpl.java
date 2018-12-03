package com.draper.system.service.impl;

import com.draper.system.dao.PermissionMapper;
import com.draper.system.entity.Permission;
import com.draper.system.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService {

    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public boolean create(Permission permission) {
        permission.setCreateAt(System.currentTimeMillis());
        permission.setUpdateAt(System.currentTimeMillis());
        permissionMapper.insert(permission);
        return true;
    }

    @Override
    public List<Permission> findAll() {
        return permissionMapper.selectAll();
    }

}
