package com.draper.service;

import com.draper.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class MD5ServiceTest extends BaseTest {

    @Autowired
    private MD5Service md5Service;

    @Test
    public void cipher() {
        System.out.println(md5Service.cipher("Draper"));
    }
}