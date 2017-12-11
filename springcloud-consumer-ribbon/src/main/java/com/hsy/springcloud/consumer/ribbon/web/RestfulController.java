package com.hsy.springcloud.consumer.ribbon.web;

import com.hsy.springcloud.consumer.ribbon.service.RestfulServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
public class RestfulController {
    @Value("${server.port}")
    String port ;
    @Autowired private RestfulServiceImpl restfulService ;
    @RequestMapping("/home")
    public String home(@RequestParam String name){
        return restfulService.getRestData(name);
    }
}
