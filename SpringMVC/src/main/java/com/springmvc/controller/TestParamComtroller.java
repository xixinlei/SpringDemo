package com.springmvc.controller;

import com.springmvc.modle.UserBean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;

@Controller
public class TestParamComtroller {

    @RequestMapping(
            "testservletAPI"
    )
    public String test_servlet(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.printf(username + "___" + password);
        return "target";
    }

//    @RequestMapping(
//            "testParam"
//    )
//    public String test_params(String username, String password) {
//        System.out.printf(username + "___" + password);
//        return "target";
//    }


//    @RequestMapping(
//            value = "testpojo"
//            , method = {RequestMethod.POST, RequestMethod.GET}
//    )
//    public String test_paramses(@RequestParam(value = "user_name", required = true, defaultValue = "username") String username, String password, String[] sex) {
//        System.out.printf(username + "___" + password + "___" + Arrays.toString(sex));
//        System.out.printf("你号");
//        return "target";
//    }


    @RequestMapping(
            value = "testpojo"
            , method = {RequestMethod.POST, RequestMethod.GET}
    )
    public String test_paramses(UserBean userBean) {
        System.out.printf(userBean.toString());
        return "target";
    }
}
