package com.draper.common.util;

import org.apache.shiro.util.Assert;
import org.junit.Test;
import org.springframework.util.StringUtils;

public class StringUtilTest {


    @Test
    public void testIsEmpty() {
        Assert.isTrue(StringUtils.isEmpty(""));
    }
}
