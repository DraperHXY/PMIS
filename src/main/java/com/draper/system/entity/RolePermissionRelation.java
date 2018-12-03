package com.draper.system.entity;

import lombok.Data;

@Data
public class RolePermissionRelation {

    /* 主键 */
    private long id;

    /* 创建时间 */
    private long createAt;

    /* 更新时间 */
    private long updateAt;

    /* 角色主键 */
    private long roleId;

    /* 权限主键 */
    private long permissionId;

}
