package com.demo.springbootdemo02.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@ResponseBody
@Controller
public class helloController {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
}
