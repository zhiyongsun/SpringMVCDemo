package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.ResponseWrapper;

@Controller
public class TestController {
    @RequestMapping("/work")
    @ResponseBody
    public String work(String acc, String pwd){
        System.out.println(acc + pwd);
        return "success";
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
