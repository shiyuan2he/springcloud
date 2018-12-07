package com.hsy.springcloud.consumer.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path springcloud/com.hsy.springcloud.consumer.config
 * @date 05/12/2018 22:49
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@126.com
 * Copyright (c) 2018 shiyuan4work@126.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudConsumerConfigAppliation {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerConfigAppliation.class);
    }
}
