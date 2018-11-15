package com.draper.web;

import com.draper.common.annotation.NotNull;
import com.draper.common.util.MD5Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/user")
@Controller
public class UserController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @PostMapping(value = "/loginIn", params = {"submit"})
    public String homePage(@RequestParam("account") @NotNull String account, @RequestParam("password") @NotNull String password) {
        LOGGER.warn("进入 Controller");
        LOGGER.warn("account = [{}], password = [{}]", account, MD5Utils.encrypt(password));

//        Map<String, String> map = new HashMap<>();


//        JWTUtil.sign();


        return "redirect:/index";
    }

}
