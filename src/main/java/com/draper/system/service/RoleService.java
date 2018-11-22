package com.draper.system.service;


import com.draper.system.entity.Role;

public interface RoleService {

    /**
     * 创建角色
     *
     * @param role
     * @return
     */
    Role createRole(Role role);

    /**
     * 删除角色
     *
     * @param roleId
     * @deprecated {@link com.draper.system.dao.RoleMapper#deleteRole(long)}
     */
    void deleteRole(Long roleId);

    /**
     * 通过角色名查找 id
     *
     * @param name
     * @return
     */
    long findIdByName(String name);

    /**
     * 通过 id 查找角色
     *
     * @param id
     * @return
     */
    Role findRole(long id);
}