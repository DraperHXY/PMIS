package com.draper.system.entity;

import lombok.Data;

@Data
public class Permission {

    /* 主键 */
    private long id;

    /* 创建时间 */
    private long createAt;

    /* 更新时间 */
    private long updateAt;

    /* 权限标识 程序中判断使用,如"user:create" */
    private String permission;

    /* 权限描述,UI界面显示使用 */
    private String description;

}