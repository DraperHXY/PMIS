package com.draper.system.service.impl;

import com.draper.system.dao.UserMapper;
import com.draper.system.entity.User;
import com.draper.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public long selectIdByAccount(String account) {
        return userMapper.selectUserByAccount(account).getId();
    }

    @Override
    public String selectPasswordByAccount(String account) {
        User user = userMapper.selectUserByAccount(account);
        if (user == null) {
            return null;
        } else {
            return user.getPassword();
        }
    }

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
            userMapper.insert(user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public void changePassword(String account, String newPassword) {

    }

    @Override
    public List<Long> findAllWorkId() {
        return userMapper.selectAllWorkId();
    }

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }

}
