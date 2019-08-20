package com.example.feigndemo.api.service.impl;

import com.example.feigndemo.api.service.EurekaClientRemoteService;
import org.springframework.stereotype.Component;

@Component
public class EurekaClientRemoteServiceImpl implements EurekaClientRemoteService {
    @Override
    public String queryInfo(String name) {
        return "sorry "+name;
    }
}
