package com.niit.niit_web_ui.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {
    @Autowired
    RestTemplate restTemplate;

    private String serviceName = "NIIT-SERVICE-ADD";

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String add(){

        return  restTemplate.getForEntity("http://"+serviceName+":8110/add?a=1&b=2",String.class).getBody();
    }
}
