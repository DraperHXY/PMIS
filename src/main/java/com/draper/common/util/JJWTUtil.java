package com.draper.common.util;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.util.Date;
import java.util.Map;

public class JJWTUtil {
    public static String sign(Map<String, Object> payload, String key) {
        // Token默认过期时间10分钟
        Date expiration = new Date(System.currentTimeMillis() + 6000 * 1000);
        return Jwts.builder()
                .setClaims(payload)
                .setExpiration(expiration)
                .signWith(SignatureAlgorithm.HS256, key.getBytes())
                .compact();
    }

    public static Map verify(String token, String key) {
        try {
            return Jwts.parser()
                    .setSigningKey(key.getBytes())
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            return null;
        }
    }

}