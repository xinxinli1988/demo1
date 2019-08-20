package com.example.feigndemo.api.service;

import com.example.feigndemo.api.service.impl.EurekaClientRemoteServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "eureka-client", fallback = EurekaClientRemoteServiceImpl.class)
public interface EurekaClientRemoteService {
    @GetMapping("/v1/info")
    String queryInfo(@RequestParam(name = "name", defaultValue = "ming") String name);
}

