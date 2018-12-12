package com.draper.system.web;

import com.draper.system.entity.Employee;
import com.draper.system.entity.Person;
import com.draper.system.service.DepartmentSerivce;
import com.draper.system.service.EmployeeService;
import com.draper.system.service.PersonService;
import com.draper.system.service.UserService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/employee")
@Controller
public class EmployeeController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PersonService personService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private DepartmentSerivce departmentSerivce;

    @Autowired
    private UserService userService;


    @GetMapping("")
    public ModelAndView employeeView(ModelAndView modelAndView) {
        modelAndView.addObject("infoList", info());
        modelAndView.addObject("allEmployees", employeeService.findAll());
        modelAndView.setViewName("employeeView");
        return modelAndView;
    }

    @GetMapping("/new")
    public ModelAndView employeeNewView(ModelAndView modelAndView) {
        modelAndView.setViewName("employeeNewView");
        modelAndView.addObject("workId", employeeService.findDefaultWorkId());
        modelAndView.addObject("allDepartments", departmentSerivce.findAll());

        return modelAndView;
    }

    @PostMapping("/new")
    public String employeeNewPost(@RequestParam Map<String, String> parameterMap) {
        boolean isCreate = employeeService.create(parameterMap);

        if (isCreate) {
            return "redirect:/employee";
        } else {
            return "redirect:/fail";
        }
    }

    private List<Map<String, String>> info() {
        List<Map<String,String>> list = new ArrayList<>();

        for (Long workId : userService.findAllWorkId()) {
            Employee employee = employeeService.findByWorkId(workId);
            Person person = personService.findByWorkId(workId);

            Map<String, String> map = new HashMap<>();

            map.put("workId", String.valueOf(employee.getId()));
            map.put("name", person.getName());
            map.put("job", employee.getJob());
            map.put("jobTitle", employee.getJobTitle());
            map.put("departmentName", departmentSerivce.find(employee.getDepartmentId()).getName());
            map.put("email", person.getEmail());
            list.add(map);
        }
        return list;
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable("id") long id) {
        boolean isDelete = departmentSerivce.delete(id);

        if (isDelete) {
            return "redirect:/index";
        } else {
            return "redirect:/fail";
        }
    }

}
