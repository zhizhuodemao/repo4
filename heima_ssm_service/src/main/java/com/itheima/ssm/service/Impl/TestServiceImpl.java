package com.itheima.ssm.service.Impl;

import com.itheima.ssm.service.TestService;

public class TestServiceImpl implements TestService {
    @Override
    public void findAll() {
        System.out.println("我找到了!");
    }
}
