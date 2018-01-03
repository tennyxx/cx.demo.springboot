package com.cx.tutor.api.util;

import com.cx.tutor.api.model.ApiResult;
import com.cx.tutor.api.model.HttpCode;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

//全局异常处理
@ControllerAdvice
public class GlobalExceptionHandler {
    //public  static  final  String DEFAULT_ERROR_VIEW="error";
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ApiResult<String> jsonErrorHandler(HttpServletRequest req, Exception e) throws Exception {
        ApiResult<String> res = new ApiResult<>();

        res.setCode(HttpCode.SERVICE_ERROR.getCode());
        res.setIsSuccess(false);
        String sOut = "";
        StackTraceElement[] trace = e.getStackTrace();
        for (StackTraceElement s : trace) {
            sOut += "\tat " + s + "\r\n";
        }
        res.setData(sOut);
        res.setMsg("统一错误处理");
        //错误日志入库暂时省略
        return res;
    }
}
