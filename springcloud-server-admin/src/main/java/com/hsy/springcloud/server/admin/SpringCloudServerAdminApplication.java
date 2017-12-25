package com.hsy.springcloud.server.admin;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author heshiyuan
 * @description <p></p>
 * @path springcloud/com.hsy.springcloud.server.admin
 * @date 2017/12/25 11:10
 * @github http://github.com/shiyuan2he
 * @email shiyuan4work@sina.com
 * Copyright (c) 2017 shiyuan4work@sina.com All rights reserved.
 * @price ¥5    微信：hewei1109
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableAdminServer
public class SpringCloudServerAdminApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringCloudServerAdminApplication.class)
                .web(true)
                .run(args)
                ;
    }
}
