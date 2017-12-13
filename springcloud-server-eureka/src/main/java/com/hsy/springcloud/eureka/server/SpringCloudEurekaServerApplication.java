package com.hsy.springcloud.eureka.server;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
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
        new SpringApplicationBuilder(SpringCloudEurekaServerApplication.class).web(true).run(args);
    }
}
