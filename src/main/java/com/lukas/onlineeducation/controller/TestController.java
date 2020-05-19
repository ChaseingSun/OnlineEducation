package com.lukas.onlineeducation.controller;

import com.lukas.onlineeducation.config.WeChatConfig;
import com.lukas.onlineeducation.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private WeChatConfig weChatConfig;

    @Autowired
    private VideoMapper videoMapper;

    @RequestMapping("test")
    public String test() {
        return "hello lukas";
    }

    @RequestMapping("test_config")
    public String testConfig() {
        System.out.println("WeChat AppId1：" + weChatConfig.getAppId());
        return "WeChat AppId1：" + weChatConfig.getAppId();
    }

    @RequestMapping("test_db")
    public Object testDB() {
        return videoMapper.findAll();
    }
}
