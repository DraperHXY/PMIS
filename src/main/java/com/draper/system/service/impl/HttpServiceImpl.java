package com.draper.system.service.impl;

import com.draper.system.service.HttpService;
import org.springframework.stereotype.Service;

@Service
public class HttpServiceImpl implements HttpService {
    @Override
    public boolean setHeader(String key, String value) {
        return false;
    }

    @Override
    public String getHeader(String key) {
        return null;
    }
}
