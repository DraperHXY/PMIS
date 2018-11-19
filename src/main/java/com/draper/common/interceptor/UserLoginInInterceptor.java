package com.draper.common.interceptor;

import com.draper.common.util.UrlStringUtil;
import com.draper.system.service.JwtService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserLoginInInterceptor implements HandlerInterceptor {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private JwtService jwtService;

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

//        Cookie[] cookies = request.getCookies();
//        String jws = null;
//
//        for (Cookie cookie : cookies) {
//            if (cookie.getName().equals("Authorization")) {
//                jws = cookie.getValue();
//                break;
//            }
//        }
//
//        if (!StringUtils.hasText(jws)) {
//            modelAndView.setViewName("loginInView");
//        } else {
//            if (!jwtService.verify(jws)) {
//                modelAndView.setViewName("loginInView");
//            }
//        }
    }

}
