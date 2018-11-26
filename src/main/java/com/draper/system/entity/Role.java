package com.draper.system.entity;

import lombok.Data;

/**
 *
 */
@Data
public class Role {

    /* 主键 */
    private long id;

    /* 创建时间 */
    private long createAt;

    /* 更新时间 */
    private long updateAt;

    /* 角色名 */
    private String name;

    /* 角色描述 */
    private String description;

}