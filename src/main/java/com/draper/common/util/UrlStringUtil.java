package com.draper.common.util;

public class UrlStringUtil {

    public static String getRequestExcludeIp(String requestUrl) {
        String[] strs = requestUrl.split("((25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))\\.){3}(25[0-5]|2[0-4]\\d|((1\\d{2})|([1-9]?\\d)))");
        strs = strs[0].split(":8080");
        return strs[0];
    }

}
