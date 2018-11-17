package com.draper.system.entity;

import lombok.Data;

@Data
public class User {

    /* 主键 */
    private long id;

    /* 创建时间 */
    private long createAt;

    /* 更新时间 */
    private long updateAt;

    /* 账号 */
    private String account;

    /* 密码 */
    private String password;

    /* 工号 */
    private long workId;

}
