package com.draper.common.shiro;

import com.draper.system.service.UserService;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class MyRealm extends AuthorizingRealm {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Override
    public String getName() {
        return "myRealm";
    }

    // 用来授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {


        return null;
    }

    // 用来认证
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        LOGGER.warn("userService = {}", userService);

        String account = (String) token.getPrincipal();
        LOGGER.warn("principal = {}", account);
        String password = userService.selectPasswordByAccount(account);
        LOGGER.warn("psw = {}", password);
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(account, password, getName());

        return info;
    }

}
