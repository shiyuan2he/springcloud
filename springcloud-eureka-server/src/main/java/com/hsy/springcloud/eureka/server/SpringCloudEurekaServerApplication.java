package com.hsy.springcloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @description <p></p>
 * @author heshiyuan
 * @date 2017/12/11 10:16
 */
@EnableEurekaServer
@SpringBootApplication
public class SpringCloudEurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaServerApplication.class,args);
    }
}
