package com.hsy.springcloud.service.config.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path springboot.demo/com.hsy.springboot.demo.springboot.jdbc
 * @date ${data} ${time}
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@RestController
@RefreshScope
@RequestMapping(value = "/api/rest")
public class RestfulController {

    @Value("${user.name}")
    String name;
    @Value("${user.age}")
    String age ;

    @GetMapping("/name")
    public String getName(){
        return name +":"+ age;
    }
}
