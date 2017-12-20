package com.hsy.springcloud.server.bus.rabbitmq.producer;

import com.hsy.springcloud.server.bus.rabbitmq.config.RabbitMqConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

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
public class Prodecer {

    private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;
    @Autowired
    private AmqpTemplate rabbitMqTemplate ;

    public void send(){
        String context = "hello" + new Date() ;
        _logger.info("正在向队列发送消息：{}",context);
        this.rabbitMqTemplate.convertAndSend(RabbitMqConfig.queueName,context);
    }
}
