package com.hsy.springcloud.server.bus.rabbitmq;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

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
@SpringBootApplication
public class SpringCloudServerBusRabbitmq {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudServerBusRabbitmq.class)
                .web(true)
                .run(args)
                ;
    }
}
