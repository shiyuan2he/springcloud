package com.hsy.springcloud.consumer.ribbon;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path springboot.demo/com.hsy.springboot.demo.springboot.jdbc
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@EnableDiscoveryClient // 注册为Eureka服务客户端，以获得服务发现与注册的能力
@SpringBootApplication
public class SpringCloudConsumerRibbonApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudConsumerRibbonApplication.class)
                .web(true)
                .run(args)
                ;
    }
}
