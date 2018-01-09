/**
 * author:liucx
 * date:2018-1-8
 * description:控制器切面拦截
 */
package com.cx.tutor.api.util;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

//配置注解，@Component也可以
@Configuration
//切面注解
@Aspect
public class ControllerFilter {
    //定义一个切入点
    @Pointcut("execution(* com.cx.tutor.api.controller.UserController.*(..))")
    public void ActionFilter() {}

    @Before("ActionFilter()")
    public void BeforeAction(JoinPoint point) {
        System.out.println("before切面");
        //ToDoSomething
    }
}
