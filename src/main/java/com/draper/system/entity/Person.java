package com.draper.system.entity;

import lombok.Data;

/**
 * 个人信息,主要包含 姓名，出生日期，身份证号等私人信息
 *
 * @see Employee
 * @see User
 */
@Data
public class Person {

    /* 主键 */
    private long id;

    /* 创建时间 */
    private long createAt;

    /* 更新时间 */
    private long updateAt;

    /* 工号 */
    private long workId;

    /* 姓名 */
    private String name;

    /* 出生日期 */
    private long birthDay;

    /* 性别 */
    private int sex;

    /* 民族 */
    private String nation;

    /* 身份证号 */
    private String personId;

    /* 移动电话 */
    private String phone;

    /* 地址 */
    private String address;

    /* 邮箱 */
    private String email;

    /* 备注 */
    private String note;

}