package com.draper.common.util;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;

/**
 * @author <link>https://github.com/wuyouzhuguli/FEBS-Shiro/blob/mysql/src/main/java/cc/mrbird/common/util/MD5Utils.java</link>
 */
public class MD5Utils {

    protected MD5Utils() {

    }

    private static final String SALT = "Draper";

    private static final String ALGORITH_NAME = "md5";

    private static final int HASH_ITERATIONS = 1;

    public static String encrypt(String pswd) {
        return new SimpleHash(ALGORITH_NAME, pswd, null, HASH_ITERATIONS).toHex();
    }

    public static String encrypt(String username, String pswd) {
        return new SimpleHash(ALGORITH_NAME, pswd, ByteSource.Util.bytes(username.toLowerCase() + SALT),
                HASH_ITERATIONS).toHex();
    }

}