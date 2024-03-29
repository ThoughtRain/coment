package com.prarui.coment.base;

import org.apache.ibatis.executor.ErrorContext;

/**
 * 自定义登录异常
 */
public class UserLoginException extends RuntimeException {

    private static final long serialVersionUID = 6958499248468627021L;
    /** 错误码 */
    private String errorCode;
    /** 错误上下文 */
    private ErrorContext errorContext;


    public UserLoginException(String errorCode, String errorMsg){
        super(errorMsg);
        this.errorCode = errorCode;
    }

    public UserLoginException(SystemCodeAndMsg systemCodeAndMsg){
        super(systemCodeAndMsg.getMsg());
        this.errorCode = systemCodeAndMsg.getCode();
    }

    public UserLoginException(String errorCode, String errorMsg,Throwable throwable){
        super(errorMsg,throwable);
        this.errorCode = errorCode;
    }

    public UserLoginException(SystemCodeAndMsg systemCodeAndMsg,Throwable throwable){
        super(systemCodeAndMsg.getMsg(),throwable);
        this.errorCode = systemCodeAndMsg.getCode();
    }
    /**
     * Getter method for property <tt>errorCode</tt>.
     *
     * @return property value of errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Setter method for property <tt>errorCode</tt>.
     *
     * @param errorCode value to be assigned to property errorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }


    /**
     * Getter method for property <tt>errorContext</tt>.
     *
     * @return property value of errorContext
     */
    public ErrorContext getErrorContext() {
        return errorContext;
    }

    /**
     * Setter method for property <tt>errorContext</tt>.
     *
     * @param errorContext value to be assigned to property errorContext
     */
    public void setErrorContext(ErrorContext errorContext) {
        this.errorContext = errorContext;
    }

}