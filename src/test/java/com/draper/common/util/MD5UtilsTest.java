package com.draper.common.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class MD5UtilsTest {

    @Test
    public void encrypt() {
        System.out.println(MD5Utils.encrypt("Draper"));
    }

    @Test
    public void encrypt1() {
        System.out.println(MD5Utils.encrypt("Draper", "123456"));
    }
}