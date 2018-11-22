package com.draper.system.service.impl;

import com.draper.system.dao.UserRoleRelationMapper;
import com.draper.system.entity.UserRoleRelation;
import com.draper.system.service.UserRoleRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleRelationServiceImpl implements UserRoleRelationService {

    @Autowired
    private UserRoleRelationMapper userRoleRelationMapper;


    @Override
    public void correlate(UserRoleRelation relation) {
        userRoleRelationMapper.correlate(relation);
    }

    @Override
    public void unCorrelate(long userId, long roleId) {
        userRoleRelationMapper.unCorrelate(userId, roleId);
    }

    @Override
    public List<UserRoleRelation> selectUserRoles(long userId) {
        return userRoleRelationMapper.selectUserRoles(userId);
    }

    @Override
    public List<UserRoleRelation> selectUsersFromRole(long roleId) {
        return userRoleRelationMapper.selectUsersFromRole(roleId);
    }

}
