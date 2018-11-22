package com.draper.system.service;


public interface UserService {

    /**
     * 通过账号查找 id
     *
     * @param account
     * @return
     */
    long selectIdByAccount(String account);


    /**
     * 通过账号查找密码
     *
     * @param account
     * @return
     */
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
     * 修改密码
     *
     * @param account
     * @param newPassword
     */
    void changePassword(String account, String newPassword);

}
