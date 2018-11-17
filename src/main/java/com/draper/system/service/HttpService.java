package com.draper.system.service;

public interface HttpService {

    boolean setHeader(String key, String value);

    String getHeader(String key);

}
