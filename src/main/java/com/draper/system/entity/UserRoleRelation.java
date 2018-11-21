package com.draper.system.entity;

import lombok.Data;

/**
 * 用户与角色的多对多关系
 */
@Data
public class UserRoleRelation {

    /* 主键 */
    private long id;

    /* 创建时间 */
    private long createAt;

    /* 更新时间 */
    private long updateAt;

    /* 用户主键 */
    private long userId;

    /* 角色主键 */
    private long roleId;

}
