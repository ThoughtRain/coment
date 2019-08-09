package com.prarui.coment.bean;

import io.swagger.annotations.ApiModelProperty;

public class UserInfo {
    @ApiModelProperty(value = "用户姓名")
    private String userName;
    @ApiModelProperty(value = "用户年龄")
    private int userAge;
    @ApiModelProperty(value = "用户ID")
    private int id;
    @ApiModelProperty(value = "用户密码")
    private String userPassWord;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserPassWord() {
        return userPassWord;
    }

    public void setUserPassWord(String userPassWord) {
        this.userPassWord = userPassWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
}

