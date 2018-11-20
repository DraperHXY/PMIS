package com.draper.system.web;

import com.draper.common.annotation.NotNull;
import com.draper.common.util.MD5Utils;
import com.draper.system.entity.User;
import com.draper.system.service.JwtService;
import com.draper.system.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;


@RequestMapping("/user")
@Controller
public class UserController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Autowired
    private JwtService jwtService;

    @GetMapping("/loginIn")
    public String indexView() {
        return "loginInView";
    }

    @PostMapping("/loginIn")
    public String addHeader(@Validated User user,
                            BindingResult bindingResult,
                            HttpServletResponse response) {
        if (bindingResult.hasErrors()){
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                LOGGER.warn("Parameter error = {}", fieldError.getDefaultMessage());
            }
        }


        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getAccount(),user.getPassword());

        subject.login(token);

        if (subject.isAuthenticated()) {
            String jws = jwtService.loginIn(user.getAccount());
            Cookie cookie = new Cookie("Authorization", jws);
            cookie.setMaxAge(60 * 1000 * 10);
            cookie.setPath("/");
            response.addCookie(cookie);
            return "redirect:/index";
        } else {
            return "redirect:/loginIn";
        }


    }

}
