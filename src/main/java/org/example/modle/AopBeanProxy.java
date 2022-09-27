package org.example.modle;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/*
    aopBean的增强代理类
 */
@Component
@Aspect
@Order(1)//多个增强代理类优先级设置,数值越小优先级越高
public class AopBeanProxy {
    /*
    抽取公共切入点表达式
     */
    @Pointcut(value = "execution(* org.example.modle.AopBean.add(..))")
    public void pointDemo() {
    }


    @Before(value = "pointDemo()")
    public void before(){
        //前置通知
        System.out.println("前置通知");
    }
    @After(value = "pointDemo()")
    public void after(){
        //前置通知
        System.out.println("后置通知");
    }

}
