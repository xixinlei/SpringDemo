package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
public class HelloControler {

    //src/main/webapp/WEB-INF/templates/index.html
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = {"/target", "/hello"}//请求地址
            ,
            method = {RequestMethod.POST, RequestMethod.GET}//请求方式
            ,
//            params = {"username = lisa", "password = 123456"}//设置参数匹配
            headers = {"Connection=keep-alive"}//请求头匹配
    )

    public String toTarget() {
        return "target";
    }
    @RequestMapping(value = {"/testPath/{id}"})
    public String testPath(@PathVariable ("id") int id){
        return "target";
    }


    @RequestMapping(value = {"/test_param"}//请求地址
            ,
            method = {RequestMethod.POST, RequestMethod.GET}//请求方式
            ,
//            params = {"username = lisa", "password = 123456"}//设置参数匹配
            headers = {"Connection=keep-alive"}//请求头匹配
    )

    public String testParam() {
        return "test_param";
    }
    @RequestMapping("test_modelandview")
    public ModelAndView testModelAndView(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("testRequest","helloModelAndView");
        modelAndView.setViewName("test_modelandview");
        return modelAndView;
    }

    @RequestMapping("test_seesion")
    public String test_seesion(HttpSession httpSession){
        httpSession.setAttribute("sessiontest","hellosession");
        return "target";
    }
}
