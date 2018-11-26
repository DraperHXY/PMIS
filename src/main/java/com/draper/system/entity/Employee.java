package com.draper.system.entity;

import lombok.Data;

/**
 * 员工信息，主要包含工作方面的信息，一般与 {@link Person} 和 {@link User} 一同调用
 */
@Data
public class Employee {

    /* 主键 */
    private long id;

    /* 创建时间 */
    private long createAt;

    /* 更新时间 */
    private long updateAt;

    /* 工号 */
    private long workId;

    /* 工作状态 */
    private State state;

    public enum State {
        INTERNSHIP, ON_JOB
    }

    /* 岗位 */
    private String job;

    /* 职务 */
    private String duty;

    /* 职务类型 */
    private DutyType dutyType;

    public enum DutyType {
        IT, MANAGEMENT, HR, FINANCE
    }

    /* 职称 */
    private String jobTitle;

    /* 职责描述 */
    private String dutyDescription;

    /* 部门 id */
    private long departmentId;

    /* 上级 id */
    private long superiorId;


}
