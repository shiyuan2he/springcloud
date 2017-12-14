package com.hsy.springcloud.consumer.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
/**
 * @author heshiyuan
 * @description <p></p>
 * @path springboot.demo/com.hsy.springboot.demo.springboot.jdbc
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@EnableDiscoveryClient
@SpringBootApplication
@EnableHystrix
//@EnableHystrixDashboard
public class SpringCloudConsumerRibbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConsumerRibbonApplication.class,args) ;
    }
}
