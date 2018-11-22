package com.draper.system.web;

import com.draper.system.entity.Department;
import com.draper.system.service.DepartmentSerivce;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
