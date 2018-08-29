package com.example.demo.controller;

import com.example.demo.entity.Customer;
import com.example.demo.model.ApiResult;
import com.example.demo.repo.CustomerRepo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by AnQiLin on 2018/7/10.
 */
@RestController
@RequestMapping(value = "customer")
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @ApiOperation(value = "保存用户")
    @PostMapping(value = "save")
    public ApiResult save(String name) {
        Customer customer = customerRepo.save(new Customer(name));
        return ApiResult.ok("保存成功", customer);
    }

    @ApiOperation(value = "获取用户列表")
    @GetMapping(value = "getList")
    public ApiResult getList() {
        return ApiResult.ok("获取用户列表", customerRepo.findAll());
    }

}
