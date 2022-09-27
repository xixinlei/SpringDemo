package org.example;

import org.example.config.SpringConfig;
import org.example.interfaces.service;
import org.example.modle.*;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 */
public class App {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        Anno2 anno = context.getBean("anno2", Anno2.class);
//        System.out.println(anno.toString());

    }

    /*
        测试jdk动态代理
     */
    @Test
    public void testProxy() {
        ServiceImpl imp = new ServiceImpl();

        service ser = (service) Proxy.newProxyInstance(imp.getClass().getClassLoader(), imp.getClass().getInterfaces(), new ServiceProxy(imp));
        ser.sum(1, 2);
        ser.avg(1, 2);
    }

    @Test
    public void testAopBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AopBean aoeBean = context.getBean("aopBean", AopBean.class);
        aoeBean.add("add方法");
    }


}
