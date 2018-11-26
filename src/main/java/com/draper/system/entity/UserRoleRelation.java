package com.draper.system.entity;

import lombok.Data;

/**
 * {@link User} 与 {@link Role} 的多对多关系
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
