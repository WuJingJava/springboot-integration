package com.liujiexin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWordController {


    @RequestMapping("helloWord")
    @ResponseBody
    public String HelloWord(){
        return "HelloWord";
    }
}
