package com.draper.system.dao;

import com.draper.BaseTest;
import com.draper.common.util.MD5Utils;
import com.draper.system.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class UserMapperTest extends BaseTest {

    @Autowired
    private UserMapper userMapper;


    @Test
    public void insertUser() {
        User user = new User();
        user.setCreateAt(System.currentTimeMillis());
        user.setUpdateAt(System.currentTimeMillis());
        user.setAccount("lida@draper.com");
        user.setPassword(MD5Utils.encrypt("lida"));
        user.setWorkId(3);

        userMapper.insert(user);
    }

    @Test
    public void selectUserByAccount() {
        User user = userMapper.selectUserByAccount("root");
        System.out.println(user.getPassword());
    }

    @Test
    public void selectUserByWorkId() {
        User user = userMapper.selectUserByWorkId(1);
        System.out.println(user.getPassword());
    }

}