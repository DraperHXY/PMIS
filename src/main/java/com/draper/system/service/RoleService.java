package com.draper.system.service;


import com.draper.system.entity.Role;

import java.util.List;

public interface RoleService {

    /**
     * 创建 role
     *
     * @param role
     * @return
     */
    Role createRole(Role role);

    /**
     * 通过 id 删除 role
     *
     * @param roleId
     * @deprecated {@link com.draper.system.dao.RoleMapper#deleteRole(long)}
     */
    void deleteRole(Long roleId);

    /**
     * 通过 name 查找 id
     *
     * @param name
     * @return
     */
    long findIdByName(String name);

    /**
     * 通过 id 查找 role
     *
     * @param id
     * @return
     */
    Role findRole(long id);

    List<Role> findAll();
}