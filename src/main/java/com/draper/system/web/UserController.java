package com.draper.system.web;

import com.draper.common.annotation.NotNull;
import com.draper.common.util.MD5Utils;
import com.draper.system.service.JwtService;
import com.draper.system.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

@RequestMapping("/user")
@Controller
public class UserController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Autowired
    private JwtService jwtService;

    @PostMapping(value = "/loginIn")
    public String homePage(@RequestParam("account") @NotNull String account,
                           @RequestParam("password") @NotNull String password,
                           HttpServletResponse response) {

        if (userService.verify(account, MD5Utils.encrypt(password))) {
            LOGGER.warn("添加 header");
            String jws = jwtService.loginIn(account);
            response.setHeader("Authorization", jws);
            return "indexView";
        } else {
            return null;
        }
    }

}
