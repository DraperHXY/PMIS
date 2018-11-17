package com.draper.system.service;

import com.draper.BaseTest;
import com.draper.common.util.MD5Utils;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class UserServiceTest extends BaseTest {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Test
    public void verify() {
        String account = "draper_hxy@163.com";
        String password = MD5Utils.encrypt("0523Draper");
//        LOGGER.warn("address = {}", userService);
//        Assert.assertTrue(userService.verify(account, password));
        Assert.assertTrue(userService.verify(account, password));

    }

    @Test
    public void loginUp() {
        String account = "draper_hxy@163.com";
        String password = MD5Utils.encrypt("0523Draper");
        LOGGER.warn("loginUp address = {}", userService);
        userService.loginUp(account, password);
    }

    @Test
    public void loginIn() {
    }

    @Test
    public void loginOut() {
    }
}