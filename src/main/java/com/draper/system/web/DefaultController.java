package com.draper.system.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping("")
@Controller
public class DefaultController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @GetMapping("")
    public String indexView1() {
        return "indexView";
    }

    @GetMapping("/index")
    public String indexView2() {
        return "indexView";
    }

    @GetMapping("/table")
    public String tableView(){
        return "tableView";
    }

}
