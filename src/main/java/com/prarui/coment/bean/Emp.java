package com.prarui.coment.bean;

import io.swagger.annotations.ApiModelProperty;

public class Emp {
    @ApiModelProperty(value = "编号")
    private int id;
    /**用户编号*/
    @ApiModelProperty(value = "用户ID")
    private int user_id;
    @ApiModelProperty(value = "用户真实姓名")
    private String realname;
    @ApiModelProperty(value = "用户邮箱")
    private String email;

    /**用户对象*/
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public User getUser() {
        return user;
    }

    public Emp setUser(User user) {
        this.user = user;
        return this;
    }
}
