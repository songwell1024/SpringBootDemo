package com.firstDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloController {
    @ResponseBody   //返回给页面数据
    @RequestMapping("/hello")   //url后缀
    public String hello(){
        return "Hello World!";
    }
}
