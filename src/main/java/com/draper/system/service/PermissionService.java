package com.draper.system.service;


import com.draper.system.entity.Permission;

import java.util.List;

public interface PermissionService {

    boolean create(Permission permission);

    List<Permission> findAll();

}
