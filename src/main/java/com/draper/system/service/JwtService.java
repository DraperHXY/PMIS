package com.draper.system.service;

public interface JwtService {

    boolean verify(String jws);

    String loginIn(String account);

}
