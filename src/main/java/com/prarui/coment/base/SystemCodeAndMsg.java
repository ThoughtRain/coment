package com.prarui.coment.base;

public class SystemCodeAndMsg {
    /**
     * 请求code
     */
    public static final int LOGIN_ERROR_CODE=111;
    /**
     * message
     */
    private String msg;
    private String code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
