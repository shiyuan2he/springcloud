package com.hsy.springcloud.service.rest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
@RequestMapping(value = "/api/rest")
public class RestfulController {

    @Autowired private RestTemplate restTemplate ;

    @Value("${server.port}")
    String port ;
    @Value("${spring.application.name}")
    String name ;

    @GetMapping(value = "/info")
    public String getInfo(){
        return "I am info from port("+port+") from application name("+name+")" ;
    }
}
