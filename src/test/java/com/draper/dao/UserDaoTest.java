package com.draper.dao;

import com.draper.BaseTest;
import com.draper.entity.User;
import com.draper.service.MD5Service;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserDaoTest extends BaseTest {

    @Autowired
    private UserDao userDao;

    @Autowired
    private MD5Service md5Service;

    @Test
    public void insertUser() {
        User user = new User();
        user.setCreateAt(System.currentTimeMillis());
        user.setUpdateAt(System.currentTimeMillis());
        user.setAccount("root");
        user.setPassword(md5Service.cipher("123456"));
        user.setWorkId(1);

        userDao.insertUser(user);
    }

    @Test
    public void selectUserByAccount() {
        User user = userDao.selectUserByAccount("root");
        System.out.println(user.getPassword());
    }

    @Test
    public void selectUserByWorkId() {
        User user = userDao.selectUserByWorkId(1);
        System.out.println(user.getPassword());
    }

}