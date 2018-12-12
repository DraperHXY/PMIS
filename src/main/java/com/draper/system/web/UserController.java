package com.draper.system.web;

import com.draper.common.annotation.NotNull;
import com.draper.common.util.MD5Utils;
import com.draper.system.entity.Employee;
import com.draper.system.entity.RolePermissionRelation;
import com.draper.system.entity.User;
import com.draper.system.entity.UserRoleRelation;
import com.draper.system.service.*;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RequestMapping("/user")
@Controller
public class UserController {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private PersonService personService;

    @Autowired
    private RoleService roleService;

    @Autowired
    private PermissionService permissionService;

    @Autowired
    private UserRoleRelationService userRoleRelationService;

    @Autowired
    private RolePermissionRelationService rolePermissionRelationService;

    @Autowired
    private JwtService jwtService;

    @GetMapping("")
    public ModelAndView userView(ModelAndView modelAndView) {
        List<Map<String, String>> infoList = new ArrayList<>();
        for (User user : userService.findAll()) {

            Map<String, String> infoMap = new HashMap<>();
            String workId = String.valueOf(user.getWorkId());
            String name = personService.findByWorkId(user.getWorkId()).getName();
            String roles = null;
            String permissions = null;
            for (UserRoleRelation roleRelation : userRoleRelationService.selectUserRoles(user.getId())) {
                roles = roles + roleService.findRole(roleRelation.getRoleId()).getName() + " ";
                for (RolePermissionRelation rolePermissionRelation : rolePermissionRelationService.selectRolePermission(roleRelation.getRoleId())) {
                    permissions = permissions + permissionService.find(rolePermissionRelation.getPermissionId()).getPermission() + " ";
                }
            }
            infoMap.put("workId", workId);
            infoMap.put("name", name);
            infoMap.put("roles", roles);
            infoMap.put("permissions", permissions);

            infoList.add(infoMap);
        }

        modelAndView.setViewName("userView");
        modelAndView.addObject("infoList", infoList);
        return modelAndView;
    }

    @GetMapping("/loginIn")
    public String indexView() {
        return "loginInView";
    }

    @PostMapping("/loginIn")
    public String addHeader(@Validated User user,
                            BindingResult bindingResult,
                            HttpServletResponse response) {
        if (bindingResult.hasErrors()) {
            for (FieldError fieldError : bindingResult.getFieldErrors()) {
                LOGGER.warn("Parameter error = {}", fieldError.getDefaultMessage());
            }
        }


        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getAccount(), user.getPassword());

        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            return e.getMessage();
        }

        if (subject.isAuthenticated()) {
            String jws = jwtService.loginIn(user.getAccount());
            Cookie cookie = new Cookie("Authorization", jws);
            cookie.setMaxAge(60 * 1000 * 10);
            cookie.setPath("/");
            response.addCookie(cookie);

            LOGGER.warn("subject's role is admin {}", subject.hasRole("admin"));
            LOGGER.warn("subject's role is user {}", subject.hasRole("user"));

            return "redirect:/index";
        } else {
            return "redirect:/loginIn";
        }


    }

    @GetMapping("/logout")
    public String logoutView() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        LOGGER.warn("处理成功");
        return "redirect:/user/loginIn";
    }

    @RequiresRoles("admin")
    @GetMapping("/password")
    public String passwordResetView() {
        return "passwordResetView";
    }

    @PostMapping("/password")
    public String passwordResetPost(String account, String password){
        try {
            userService.changePassword(account, password);
            return "redirect:/index";
        } catch (Exception e){
            e.printStackTrace();
            return "redirect:/fail";
        }
    }

    @GetMapping("/role/{id}")
    public String roleCorrelateView(){
        return "roleCorrelateView";
    }





}
