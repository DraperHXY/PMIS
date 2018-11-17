package com.draper.system.service;

public interface UserService {

    boolean verify(String account, String password);

    boolean loginUp(String account, String password);

    String loginIn(String account);

    String loginOut(String account);

}
