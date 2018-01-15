package com.cx.tutor.api.controller;

import com.cx.tutor.api.model.ApiResult;
import com.cx.tutor.api.model.HttpCode;
import com.cx.tutor.api.model.User;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/User")
public class UserController {
    //注入的注解
    @Autowired
    private  User uinfo;
    @Autowired
    private  ApiResult<User> res;

    //创建线程安全的Map
    static Map<Long, User> user = Collections.synchronizedMap(new HashMap<Long, User>());

    @ApiOperation(value = "根据用户ID获取用户详情",notes = "获取用户信息")
    @ApiImplicitParam(name = "id",value = "用户id",required =true, dataType ="Long",paramType ="path")
    @RequestMapping(value = "/UserInfo/{id}", method = RequestMethod.GET)

    public ApiResult<User> getUserInfo(@PathVariable Long id) {
        //暂时省略取数据
        uinfo.setAge(123);
        uinfo.setId(1);
        uinfo.setName("liucx");
        res.setIsSuccess(true);
        res.setData(uinfo);
        res.setCode(HttpCode.OK.getCode());
        res.setMsg("请求成功");
        return res;
    }

    /*
      测试统一异常处理，抛出异常
     */
    @ApiOperation(value = "测试统一异常处理",notes = "测试统一异常处理，抛出异常")
    @RequestMapping(value = "/TestError",method = RequestMethod.GET)
    public String testError() throws Exception {
        throw new Exception("发生错误");
    }
}
