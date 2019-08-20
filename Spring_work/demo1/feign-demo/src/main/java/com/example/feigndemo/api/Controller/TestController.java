package com.example.feigndemo.api.Controller;


import com.example.feigndemo.api.service.EurekaClientRemoteService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestController {
    @Autowired
    private EurekaClientRemoteService eurekaClientRemoteService;
    @GetMapping("/feign")
    public String checkFeign() {
        return eurekaClientRemoteService.queryInfo("feign");
    }


}
