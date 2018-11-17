package com.draper.system.entity;

import lombok.Data;

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

    /* 地址 */
    private String address;

    /* 邮箱 */
    private String email;

    /* 备注 */
    private String note;

}