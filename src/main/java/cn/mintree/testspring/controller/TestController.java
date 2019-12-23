package cn.mintree.testspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/t")
public class TestController {

    @RequestMapping("/test1")
    public Object test1(){
        return "test1";
    }

    @RequestMapping("/test2")
    public Object test2(){
        return "test2";
    }
}
