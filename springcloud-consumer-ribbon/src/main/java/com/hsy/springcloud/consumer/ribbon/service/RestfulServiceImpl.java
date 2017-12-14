package com.hsy.springcloud.consumer.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
@Service("restfulSerivce")
public class RestfulServiceImpl {

    @Autowired private RestTemplate restTemplate ;

    @HystrixCommand(fallbackMethod = "serviceFallback")
    public String getRestData(){
        return restTemplate.getForObject("http://springcloud-producer-rest/api/rest/info",String.class) ;
    }

    public String serviceFallback() {
        return "hi,sorry,error!";
    }
}
