package com.draper.entity;

import lombok.Data;

@Data
public class Work {

    /* 主键 */
    private long id;

    /* 创建时间 */
    private long createAt;

    /* 更新时间 */
    private long updateAt;

    /* 工号 */
    private long workId;

    /* 工作状态 */
    private StateJob stateJob;

    public enum StateJob {
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
