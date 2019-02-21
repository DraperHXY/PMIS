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
        System.out.println(MD5Utils.encrypt("admin@admin.admin", "admin"));
    }

    /**
     * 这个是密码哈希
     */
    @Test
    public void MD5Hash() {
        // FIXME: 2019-02-20 密码的 Hash 没有正确计算
        Md5Hash md5Hash = new Md5Hash("admin");
        System.out.println(md5Hash);

    }
}