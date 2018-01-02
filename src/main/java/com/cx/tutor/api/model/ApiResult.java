package com.cx.tutor.api.model;


public class ApiResult <T>  {
    //成功标识
    private   boolean IsSuccess;

    //泛型数据
    private T Data;
    //返回信息
    private  String Msg;
    //http状态码
    private  int  Code;
    //无参数的构造器
    public  ApiResult(){
    }
    //有参数的构造器
    public  ApiResult(boolean IsSuccess,T Data, String Msg,int Code){
        this.IsSuccess = IsSuccess;
        this.Data=Data;
        this.Msg = Msg;
        this.Code=Code;
    }
    public void setIsSuccess(boolean success) {
        IsSuccess = success;
    }

    public void setCode(int code) {
        Code = code;
    }

    public void setData(T data) {
        Data = data;
    }

    public void setMsg(String msg) {
        Msg = msg;
    }

    public boolean getIsSuccess() {
        return IsSuccess;
    }

    public T getData() {
        return Data;
    }

    public String getMsg() {
        return Msg;
    }

    public int getCode() {
        return Code;
    }
}

