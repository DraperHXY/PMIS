package com.draper.system.service;

import com.draper.system.entity.User;

import java.util.Set;

public interface UserService {

    String selectPasswordByAccount(String account);


    /**
     * 验证是否合法用户
     *
     * @param account
     * @param password
     * @return
     */
    boolean verify(String account, String password);

    /**
     * 注册新用户
     *
     * @param account
     * @param password
     * @return
     */
    boolean loginUp(String account, String password);

    /**
     * 用户登录
     *
     * @param account
     * @return
     */
    String loginIn(String account);


    String loginOut(String account);

    /**
     * 修改密码
     *
     * @param account
     * @param newPassword
     */
    void changePassword(String account, String newPassword);

    /**
     * 添加用户-角色关系
     *
     * @param account
     * @param roleIds
     */
    void correlationRoles(String account, Long... roleIds);


    /**
     * 移除用户-角色关系
     *
     * @param account
     * @param roleIds
     */
    void uncorrelationRoles(String account, Long... roleIds);

    /**
     * 根据账号查找其角色
     *
     * @param account
     * @return
     */
    Set<String> findRoles(String account);

    /**
     * 根据账号查找其权限
     *
     * @param account
     * @return
     */
    Set<String> findPermissions(String account);


}
