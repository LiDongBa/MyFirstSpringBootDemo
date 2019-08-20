package com.hello.boot.spring.hellospringboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {
    @RequestMapping("/")
    @ResponseBody
    public String sayHello(){
        return "HELLO SPRING BOOT2.1.7";
    }
}
