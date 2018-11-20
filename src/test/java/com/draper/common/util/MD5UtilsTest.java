package com.draper.common.util;

import org.apache.shiro.crypto.hash.Md5Hash;
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

    @Test
    public void MD5Hash() {
        Md5Hash md5Hash = new Md5Hash("0523Draper");
        System.out.println(md5Hash);

    }
}