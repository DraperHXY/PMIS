package com.draper.common.util;

import org.apache.shiro.util.Assert;
import org.junit.Test;
import org.springframework.util.StringUtils;

public class StringUtilTest {


    @Test
    public void testIsEmpty() {
        Assert.isTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void test(){
        String requestUrl = "http://127.0.0.1:8080/PMIS/index";
        String[] strs = requestUrl.split("((25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))");
        strs = strs[1].split(":8080");
        for (String str : strs) {
            System.out.println(str);
        }
    }
}
