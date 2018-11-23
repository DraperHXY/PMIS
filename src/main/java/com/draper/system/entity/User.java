package com.draper.system.entity;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * 系统用户
 * 负责账号密码
 */
@Data
public class User {

    /* 主键 */
    private long id;

    /* 创建时间 */
    private long createAt;

    /* 更新时间 */
    private long updateAt;

    /* 账号 */
    @NotBlank(message = "user.account.notBlank")
    private String account;

    /* 密码 */
    @NotBlank(message = "user.password.notBlank")
    private String password;

    /* 工号 */
    private long workId;

    private String salt;

    private Boolean locked = Boolean.FALSE;

    public String getCredentialsSalt() {
        return account + salt;
    }

}
