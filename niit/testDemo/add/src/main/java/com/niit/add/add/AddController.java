package com.niit.add.add;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AddController {
    @GetMapping("/add")
    public int add(int a,int b){
        return a+b;
    }

    @RequestMapping("/")
    public String hello() {
        return "hello";
    }
}
