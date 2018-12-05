package com.draper.system.web;


import com.draper.system.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping("/role")
@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("")
    public ModelAndView roleView(ModelAndView modelAndView){
        modelAndView.setViewName("roleView");
        modelAndView.addObject("allRoles", roleService.findAll());
        return modelAndView;
    }

}
