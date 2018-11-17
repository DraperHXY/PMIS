package com.draper.common.util;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.lang.Nullable;

import java.security.Key;
import java.util.Date;
import java.util.Map;

/**
 * <link>https://github.com/DumbSaid/Tiles/blob/39af5a15c3/src/main/java/com/mutesaid/utils/JJWTUtil.java</link>
 */
public class JWTUtil {
    /* 默认算法为 HS256 */
    public static final SignatureAlgorithm DEFAULT_ALGORITHM = SignatureAlgorithm.HS256;

    /* 默认过期时间一小时 */
    public static final long DEFAULT_EXPIRE_TIME = (60 * 60 * 1000);

    private static Key key;

    public static String sign(Map<String, Object> payload, @Nullable SignatureAlgorithm algorithm, @Nullable long expireTime) {
        if (algorithm == null)
            algorithm = DEFAULT_ALGORITHM;

        if (expireTime == 0)
            expireTime = DEFAULT_EXPIRE_TIME;

        if (key == null) {
            key = Keys.secretKeyFor(algorithm);
        }

        return Jwts.builder()
                .setClaims(payload)
                .setExpiration(new Date(System.currentTimeMillis() + expireTime))
                .signWith(key)
                .compact();
    }

    public static Jws<Claims> verify(String jws) {
        if (key == null) {
            key = Keys.secretKeyFor(DEFAULT_ALGORITHM);
        }

        return Jwts.parser()
                .setSigningKey(key)
                .parseClaimsJws(jws);
    }

}
