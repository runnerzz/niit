package com.haha.add;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
    @GetMapping("/add")
    public int add(int a,int b){
        return a+b;
    }
}
