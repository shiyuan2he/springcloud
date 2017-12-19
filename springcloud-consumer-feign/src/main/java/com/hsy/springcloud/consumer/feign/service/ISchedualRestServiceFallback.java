package com.hsy.springcloud.consumer.feign.service;

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
public class ISchedualRestServiceFallback implements ISchedualRestService{

    @Override
    public String infos() {
        return "error,this is Hystrix return";
    }
}
