package com.draper.system.service.impl;

import com.draper.common.util.MD5Utils;
import com.draper.system.dao.EmployeeMapper;
import com.draper.system.dao.PersonMapper;
import com.draper.system.dao.UserMapper;
import com.draper.system.entity.Employee;
import com.draper.system.entity.Person;
import com.draper.system.entity.User;
import com.draper.system.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private EmployeeMapper employeeMapper;

    @Autowired
    private PersonMapper personMapper;

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<Employee> findAll() {
        return employeeMapper.selectAll();
    }

    @Override
    public long findDefaultWorkId() {
        return employeeMapper.selectMaxId() + 1;
    }

    @Override
    public boolean create(Map<String, String> parameterMap) {

        try {
            insertPerson(parameterMap);
            insertEmployee(parameterMap);
            insertUser(parameterMap);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public Employee findByWorkId(long workId) {
        return employeeMapper.selectByWorkId(workId);
    }

    private void insertEmployee(Map<String, String> parameterMap) {
        Employee employee = new Employee();
        employee.setCreateAt(System.currentTimeMillis());
        employee.setUpdateAt(System.currentTimeMillis());
        employee.setWorkId(Long.valueOf(parameterMap.get("workId")));

        switch (parameterMap.get("state")) {
            case "internship":
                employee.setState(Employee.State.INTERNSHIP);
                break;
            case "onJob":
                employee.setState(Employee.State.ON_JOB);
                break;
            default:
                break;
        }

        employee.setJob(parameterMap.get("job"));
        employee.setDuty(parameterMap.get("duty"));

        switch (parameterMap.get("dutyType")) {
            case "it":
                employee.setDutyType(Employee.DutyType.IT);
                break;
            case "management":
                employee.setDutyType(Employee.DutyType.MANAGEMENT);
                break;
            case "hr":
                employee.setDutyType(Employee.DutyType.HR);
                break;
            case "finance":
                employee.setDutyType(Employee.DutyType.FINANCE);
                break;
            default:
                break;
        }
        employee.setJobTitle(parameterMap.get("jobTitle"));
        employee.setDepartmentId(Long.valueOf(parameterMap.get("departmentId")));
        employee.setSuperiorId(Long.valueOf(parameterMap.get("superiorId")));

        employeeMapper.insert(employee);
        LOGGER.warn("employee = {}", employee);
    }

    private void insertPerson(Map<String, String> parameterMap) throws ParseException {
        Person person = new Person();
        person.setCreateAt(System.currentTimeMillis());
        person.setUpdateAt(System.currentTimeMillis());
        person.setWorkId(Long.valueOf(parameterMap.get("workId")));
        person.setName(parameterMap.get("name"));

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDay = format.parse(parameterMap.get("birthDay"));
        person.setBirthDay(birthDay.getTime());

        person.setSex(Integer.valueOf(parameterMap.get("sex")));
        person.setNation(parameterMap.get("nation"));
        person.setPersonId(parameterMap.get("personId"));
        person.setPhone(parameterMap.get("phone"));
        person.setAddress(parameterMap.get("address"));
        person.setEmail(parameterMap.get("email"));

        personMapper.insert(person);
        LOGGER.warn("person = {}", person);
    }

    private void insertUser(Map<String, String> parameterMap) {
        User user = new User();
        user.setCreateAt(System.currentTimeMillis());
        user.setUpdateAt(System.currentTimeMillis());
        user.setAccount(parameterMap.get("account"));
        user.setPassword(MD5Utils.encrypt(parameterMap.get("password")));
        user.setWorkId(Long.valueOf(parameterMap.get("workId")));

        userMapper.insert(user);
        LOGGER.warn("user = {}", user);
    }

}
