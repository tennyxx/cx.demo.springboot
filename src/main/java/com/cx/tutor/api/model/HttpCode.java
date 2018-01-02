package com.cx.tutor.api.model;

public enum HttpCode {
    OK("请求成功", 200),
    SERVICE_ERROR("服务器错误", 500),
    UNAUTHORIZED("未授权", 401),
    NOTFOUND("未找到资源", 404);
    private String name ;
    private int code ;
    private HttpCode( String name , int code ){
        this.name = name ;
        this.code = code ;
    }
    public String getName() {
        return name;
    }
    public int getCode() {
        return code;
    }
}