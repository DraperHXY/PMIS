package com.draper.system.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("")
@Controller
public class DefaultController {

    @GetMapping("")
    public String indexView(){
        return "indexView";
    }

}
