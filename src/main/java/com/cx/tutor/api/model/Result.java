package com.cx.tutor.api.model;

/**
 * 统一返回格式
 * @author liucx
 */
public class Result {
    private Integer code;
    private String message;
    private Object data;
    public static final int success=10000;
    public static final int fail=9999;

    public Result() {
        this.code=success;
        this.message="请求成功";
    }

    public Result(int code,String message){
        if (code==success) {
            this.code=success;
        }else{
            this.code=code;
        }
        this.message=message;
        this.data=null;
    }
    public Result(Integer code,String message,Object data){
        this.code=code;
        this.message=message;
        this.data=data;
    }
    public Result(Object data){
        this.code=success;
        this.message="请求成功";
        this.data=data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}