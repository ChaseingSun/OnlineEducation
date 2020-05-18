package com.lukas.onlineeducation.controller;

import com.lukas.onlineeducation.config.WeChatConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private WeChatConfig weChatConfig;

    @RequestMapping("test")
    public String test(){
        return "hello lukas";
    }

    @RequestMapping("test_config")
    public String testConfig(){
        return weChatConfig.getAppId();
    }
}
