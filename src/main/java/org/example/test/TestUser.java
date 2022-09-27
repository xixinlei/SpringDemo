package org.example.test;

import org.example.entity.User;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class TestUser {

    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = context.getBean("userService", UserService.class);

//        User user = new User();
//        user.setUserId(1);
//        user.setUserName("哈三");
//        user.setUstatus("c");
//        userService.addUser(user);
//        userService.updateUser(user);
//        userService.deleteUser(1);
//        System.out.printf("一共有" +userService.findcount()+"条数据");

//        System.out.printf(userService.findUser(1).toString());
//        List<User> allUser = userService.findAllUser();
//        System.out.printf(allUser.toString());
//        List<Object[]> userList = new ArrayList<Object[]>();
//        userList.add(new Object[]{2, "李四","f"});
//        userList.add(new Object[]{3, "流星","f"});
//        userList.add(new Object[]{4, "王五","f"});
//        userList.add(new Object[]{5, "嘻哈","f"});
//        userList.add(new Object[]{6, "哼哈","f"});
//        userService.addBatchUser(userList);
//        userService.batchUpdateUser(userList);

        List<Object[]> ids = new ArrayList<Object[]>();
        ids.add(new Object[]{5});
        ids.add(new Object[]{6});
        userService.batchDeleteUser(ids);

    }

}
