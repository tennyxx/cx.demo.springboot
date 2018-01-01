package com.cx.tutor.api.controller;

import com.cx.tutor.api.model.ApiResult;
import com.cx.tutor.api.model.HttpCode;
import com.cx.tutor.api.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/User")
public class UserController {
    //创建线程安全的Map
    static Map<Long,User>user = Collections.synchronizedMap(new HashMap<Long,User>());

    @RequestMapping(value = "/UserInfo",method = RequestMethod.GET)
    public ApiResult<User> getUserInfo(){
        ApiResult<User> res = new ApiResult<User>();
        res.setSuccess(false);
        try {
            //暂时省略取数据
            User user = new User();
            user.setAge(123);
            user.setId(1);
            user.setName("liucx");
            res.setSuccess(true);
            res.setData(user);
            res.setCode(HttpCode.OK.getCode());
            res.setMsg("请求成功");
        }
        catch (Exception e){
            res.setCode(HttpCode.ServerError.getCode());
            res.setMsg("请求失败，原因"+e.toString());
        }
        return  res;
    }
}
