package com.draper.system.web;

import com.draper.system.entity.Permission;
import com.draper.system.service.PermissionService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@RequestMapping("/permission")
@Controller
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

    @GetMapping("")
    public ModelAndView permissionView(ModelAndView modelAndView) {
        modelAndView.addObject("allPermission", permissionService.findAll());
        modelAndView.setViewName("permissionView");
        return modelAndView;
    }

    @GetMapping("/new")
    public ModelAndView permissionNewView(ModelAndView modelAndView) {
        modelAndView.setViewName("permissionNewView");
        return modelAndView;
    }

    @PostMapping("/new")
    public String permissionNewPost(@RequestParam("permission") String permissionDetail, @RequestParam("description") String description) {
        Permission permission = new Permission();
        permission.setPermission(permissionDetail);
        permission.setDescription(description);

        boolean isCreate = permissionService.create(permission);

        if (isCreate) {
            return "redirect:/permission";
        } else {
            return "redirect:/fail";
        }
    }


}
