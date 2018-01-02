package com.cx.tutor.api.controller;

import com.cx.tutor.api.model.ApiResult;
import com.cx.tutor.api.model.HttpCode;
import com.cx.tutor.api.model.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("/User")
public class UserController {
    //创建线程安全的Map
    static Map<Long, User> user = Collections.synchronizedMap(new HashMap<Long, User>());

    @ApiOperation(value = "获取用户详情",notes = "获取用户信息")
    @ApiImplicitParam(name = "id",value = "用户id",required =true, dataType ="Long")
    @RequestMapping(value = "/UserInfo/{id}", method = RequestMethod.GET)
    public ApiResult<User> getUserInfo(@PathVariable Long id) {
        ApiResult<User> res = new ApiResult<User>();
        res.setIsSuccess(false);
        //暂时省略取数据
        User user = new User();
        user.setAge(123);
        user.setId(1);
        user.setName("liucx");
        res.setIsSuccess(true);
        res.setData(user);
        res.setCode(HttpCode.OK.getCode());
        res.setMsg("请求成功");
        return res;
    }

    /*
      测试统一异常处理，抛出异常
     */
    @ApiOperation(value = "测试异常",notes = "测试统一异常处理，抛出异常")
    @RequestMapping("/TestError")
    public String testError() throws Exception {
        throw new Exception("发生错误");
    }
}
