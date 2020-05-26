package com.lukas.onlineeducation.controller;

import com.lukas.onlineeducation.config.WeChatConfig;
import com.lukas.onlineeducation.domain.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Controller
@RequestMapping("/api/v1/wechat")
public class WechatController {

    @Autowired
    private WeChatConfig weChatConfig;

    @GetMapping("login_url")
    public JsonData loginUrl(@RequestParam(value = "access_page",required = true)String accessPage) throws UnsupportedEncodingException {

        //获取开放平台重定向地址
        String redirecUrl = weChatConfig.getOpenRedirectUrl();

        //进行编码
        String callbackUrl = URLEncoder.encode(redirecUrl,"GBK");

        String qrcodeUrl = String.format(WeChatConfig.getOpenQrcodeUrl(),weChatConfig.getAppId(),callbackUrl,accessPage);

        return JsonData.buildSuccess(qrcodeUrl);
    }
}
