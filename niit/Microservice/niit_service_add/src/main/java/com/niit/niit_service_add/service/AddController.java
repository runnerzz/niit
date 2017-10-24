package com.niit.niit_service_add.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class AddController {

    @Autowired
    DiscoveryClient client;

    private final Logger logger = Logger.getLogger("service add");

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public int Add(@RequestParam int a, @RequestParam int b) {
        //ServiceInstance instance = client.getLocalServiceInstance();
        //logger.info("host:"+instance.getHost()+",service id:"+instance.getServiceId());
        return a + b;
    }

}
