package com.draper.system.entity;

import lombok.Data;

@Data
public class SalaryWlfare {

    /* 主键 */
    private long id;

    /* 创建时间 */
    private long createAt;

    /* 更新时间 */
    private long updateAt;

    /* 工号 */
    private long workId;

    /* 基本工资 */
    private double basicSalary;

    /* 岗位补贴 */
    private double supplementBenefic;

    /* 达标奖金 */
    private double bonus;

    /* 个人所得税 */
    private double incomeTax;

    /* 总计 */
    private double total;

    /* note */
    private String note;

}
