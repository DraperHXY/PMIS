package com.draper.system.service.impl;

import com.draper.system.dao.RoleMapper;
import com.draper.system.entity.Role;
import com.draper.system.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public Role createRole(Role role) {
        roleMapper.insertRole(role);
        return null;
    }

    @Override
    public void deleteRole(Long roleId) {
        roleMapper.deleteRole(roleId);
    }

    @Override
    public long findIdByName(String name) {
        return roleMapper.selectIdByName(name);
    }

    @Override
    public Role findRole(long id) {
        return roleMapper.selectRole(id);
    }

    @Override
    public List<Role> findAll() {
        return roleMapper.selectAll();
    }

}