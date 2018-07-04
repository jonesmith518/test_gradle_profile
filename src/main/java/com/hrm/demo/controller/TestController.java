package com.hrm.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Value("${spring.datasource.url}")
    private String dbUrl;


    @RequestMapping("/test")
    @ResponseBody
    String home() {
        return "Hello World!"+this.dbUrl;//返回结果为字符串
    }
}
