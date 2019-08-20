package com.example.testclent.api.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TestController {
    @Value("${server.port}")
    private String port;
    @GetMapping("/info")
    public String queryInfo(@RequestParam(name = "name", defaultValue = "ming") String name) {
        return name + "你好！这里是" + port;
    }

}
