package com.draper.system.service;


import java.util.List;

public interface UserService {

    /**
     * 通过 account 查找 id
     *
     * @param account
     * @return
     */
    long selectIdByAccount(String account);


    /**
     * 通过 account 查找 password
     *
     * @param account
     * @return
     */
    String selectPasswordByAccount(String account);

    /**
     * 验证是否合法 user
     *
     * @param account
     * @param password
     * @return
     */
    boolean verify(String account, String password);

    /**
     * 注册 user
     *
     * @param account
     * @param password
     * @return
     */
    boolean loginUp(String account, String password);

    /**
     * 修改 password
     *
     * @param account
     * @param newPassword
     */
    void changePassword(String account, String newPassword);

    List<Long> findAllWorkId();

}
