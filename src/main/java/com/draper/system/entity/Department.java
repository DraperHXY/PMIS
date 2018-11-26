package com.draper.system.entity;

import lombok.Data;

/**
 * 部门信息
 */
@Data
public class Department {

    /* 主键 */
    private long id;

    /* 创建时间 */
    private long createAt;

    /* 更新时间 */
    private long updateAt;

    /* 部门名称 */
    private String name;

    /* 部门所属 */
    private long fromDepartmentId;

    /* 部门领导 id */
    private long departmentLeaderId;

    /* 部门电话 */
    private String departmentPhone;

    /* 办公室 */
    private String office;

    /* 备注 */
    private String note;

}
