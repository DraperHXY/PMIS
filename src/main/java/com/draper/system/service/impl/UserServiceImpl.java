package com.draper.system.service.impl;

import com.draper.system.dao.UserMapper;
import com.draper.system.entity.User;
import com.draper.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean verify(String account, String password) {
        User user = userMapper.selectUserByAccount(account);
        if (user.getPassword().equals(password))
            return true;
        return false;
    }

    @Override
    public boolean loginUp(String account, String password) {
        try {
            User user = new User();
            user.setAccount(account);
            user.setPassword(password);
            user.setCreateAt(System.currentTimeMillis());
            user.setUpdateAt(System.currentTimeMillis());
            // TODO: 2018/11/16 user.setWorkId
            userMapper.insertUser(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public String loginIn(String account) {
        return null;
    }

    @Override
    public String loginOut(String account) {
        return null;
    }
}
