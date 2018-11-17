package com.draper.system.service.impl;

import com.draper.common.util.JWTUtil;
import com.draper.system.service.JwtService;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import org.springframework.stereotype.Service;

@Service
public class JwtServiceImpl implements JwtService {
    @Override
    public boolean verify(String jws) {
        try {
            JWTUtil.verify(jws);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public String loginIn(String account) {
        Claims claims = Jwts.claims();
        claims.setSubject(account);
        return JWTUtil.sign(claims, JWTUtil.DEFAULT_ALGORITHM, JWTUtil.DEFAULT_EXPIRE_TIME);
    }

}
