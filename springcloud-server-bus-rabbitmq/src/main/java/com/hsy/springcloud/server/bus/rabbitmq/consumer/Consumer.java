package com.hsy.springcloud.server.bus.rabbitmq.consumer;

import com.hsy.springcloud.server.bus.rabbitmq.config.RabbitMqConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

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
@Component
@RabbitListener(queues = RabbitMqConfig.queueName)
public class Consumer {
    private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;

    @RabbitHandler
    public void consumer(String message){
        _logger.info("从队列获取到的消息:{}",message);
    }
}
