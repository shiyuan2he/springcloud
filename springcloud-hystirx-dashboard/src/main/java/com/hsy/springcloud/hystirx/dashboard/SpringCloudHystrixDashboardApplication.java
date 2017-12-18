package com.hsy.springcloud.hystirx.dashboard;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path springboot.demo/com.hsy.springboot.demo.springboot.jdbc
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@SpringCloudApplication
@EnableHystrixDashboard
public class SpringCloudHystrixDashboardApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudHystrixDashboardApplication.class)
                .web(true)
                .run(args) ;
    }
}
