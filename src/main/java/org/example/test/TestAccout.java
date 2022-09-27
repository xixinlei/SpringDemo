package org.example.test;

import org.example.config.SpringConfig;
import org.example.service.BankService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ExtendWith(SpringExtension.class) //指定单元测试版本
@ContextConfiguration(classes = SpringConfig.class) //加载配置文件
public class TestAccout {

    @Autowired
    private BankService service;

    @Test
    public void testAccount() {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//        BankService service = context.getBean("bankService", BankService.class);

        service.Transfer(1, 2, 100);
    }
}
