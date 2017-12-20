package com.hsy.springcloud.server.bus.rabbitmq.web;

import com.hsy.springcloud.server.bus.rabbitmq.producer.Prodecer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
@Controller
@RequestMapping("/api/rest")
public class RestfulController {

    @Autowired
    Prodecer prodecer ;
    @GetMapping("/message")
    public void message(){
        prodecer.send();
    }
}
