package com.draper.common.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.junit.Test;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class JWTUtilTest {

    @Test
    public void sign() {
        Map<String, Object> payload = new HashMap<>();
        payload.put("sub", "Draper");
        payload.put("wid", 123456);


        String jws = JWTUtil.sign(payload, null, JWTUtil.DEFAULT_EXPIRE_TIME);
        System.out.println("jws = " + jws);
        Jws<Claims> claimsJws = JWTUtil.verify(jws);
        System.out.println(claimsJws.getBody().getSubject());
        System.out.println(claimsJws.getBody().get("wid"));


    }

    @Test
    public void verify() {

    }

    @Test
    public void key() {
        Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);
        System.out.println(key.getAlgorithm());
        System.out.println(key.getEncoded());
    }
}