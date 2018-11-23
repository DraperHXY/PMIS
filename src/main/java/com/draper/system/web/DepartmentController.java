package com.draper.system.web;

import com.draper.system.entity.Department;
import com.draper.system.service.DepartmentSerivce;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RequestMapping("/department")
@Controller
public class DepartmentController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DepartmentSerivce departmentSerivce;

    @GetMapping("")
    public ModelAndView departmentView(ModelAndView modelAndView) {
        List<Department> departmentList = departmentSerivce.findAll();
        modelAndView.setViewName("departmentAllView");
        modelAndView.addObject("allDepartments", departmentList);
        return modelAndView;
    }

    @GetMapping("/all")
    public ModelAndView departmentAllView(ModelAndView modelAndView) {
        List<Department> departmentList = departmentSerivce.findAll();
        modelAndView.setViewName("departmentAllView");
        modelAndView.addObject("allDepartments", departmentList);
        return modelAndView;
    }

    @GetMapping("/new")
    public String departmentNewView() {
        return "departmentNewView";
    }

    @PostMapping("/new")
    public String departmentNewPost(Department department) {
        departmentSerivce.createDepartment(department);
        return "redirect:/department";
    }

    @GetMapping("/modify/{id}")
    public String departmentModifyView(@PathVariable long id) {
        return "departmentModifyView";
    }

    @PostMapping("/modify/{id}")
    public String departmentModifyPost(@PathVariable("id") long id, @RequestParam("key") String key, @RequestParam("value") String value) {
        LOGGER.warn("key = {}", key);
        LOGGER.warn("value = {}", value);

        boolean isModify = departmentSerivce.modifyKeyById(key, value, id);

        if (isModify) {
            return "redirect:/department";
        } else {
            return "redirect:/fail";
        }

    }

    @DeleteMapping("/delete/{id}")
    public String departmentDeleteDelete(@PathVariable("id") long id) {
        boolean isDelete = departmentSerivce.delete(id);

        if (isDelete) {
            return "redirect:/department";
        } else {
            return "redirect:/fail";
        }
    }

    @GetMapping("/delete/{id}")
    public String departmentDeleteView(@PathVariable long id) {
        LOGGER.warn("id = {}", id);
        return "departmentDeleteView";
    }

}
