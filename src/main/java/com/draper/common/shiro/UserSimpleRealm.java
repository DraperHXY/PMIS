package com.draper.common.shiro;

import com.draper.system.entity.Role;
import com.draper.system.entity.UserRoleRelation;
import com.draper.system.service.PermissionService;
import com.draper.system.service.RoleService;
import com.draper.system.service.UserRoleRelationService;
import com.draper.system.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UserSimpleRealm extends AuthorizingRealm {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private UserRoleRelationService userRoleRelationService;

    @Autowired
    private PermissionService permissionService;

    @Autowired

    @Override
    public String getName() {
        return "userSimpleRealm";
    }

    // 用来授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

        String account = (String) principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        List<UserRoleRelation> relations = userRoleRelationService.selectUserRoles(userService.selectIdByAccount(account));

        List<String> stringList = new ArrayList<>();

        for (UserRoleRelation relation : relations) {
            Role role = roleService.findRole(relation.getRoleId());
            stringList.add(role.getName());
        }

        Set<String> sets = new HashSet<>(stringList);

        info.setRoles(sets);

        return info;
    }

    // 用来认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String account = (String) token.getPrincipal();
        String password = userService.selectPasswordByAccount(account);
        LOGGER.warn("credital = {}", password);
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(account, password, getName());

        return authenticationInfo;
    }

}
