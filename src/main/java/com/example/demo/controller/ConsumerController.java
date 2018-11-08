package com.example.demo.controller;

import com.example.demo.model.ApiResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by AnQiLin on 2018/9/28.
 * 服务消费
 */
@RestController
@RequestMapping(value = "consumer")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value = "getCustomerList")
    public ApiResult getCustomerList() {
        return restTemplate.getForEntity("http://unmanned-container/Usr/loginUsr", ApiResult.class).getBody();
    }
}
