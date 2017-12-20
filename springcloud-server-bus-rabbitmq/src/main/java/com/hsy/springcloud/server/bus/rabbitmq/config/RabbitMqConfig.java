package com.hsy.springcloud.server.bus.rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Configuration;

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
@Configuration
public class RabbitMqConfig {

    public static final String queueName = "springcloud-server-bus-rabbitmq" ;
    public Queue rabbitMqQueue(){
        return new Queue(queueName);
    }
}
