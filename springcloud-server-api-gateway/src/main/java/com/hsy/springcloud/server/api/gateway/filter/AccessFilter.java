package com.hsy.springcloud.server.api.gateway.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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
public class AccessFilter extends ZuulFilter {
    private final Logger _logger = LoggerFactory.getLogger(this.getClass()) ;
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext() ;
        HttpServletRequest request = ctx.getRequest() ;

        _logger.info("send {} to {}",request.getMethod(),request.getRequestURL().toString());

        Object token = request.getParameter("token") ;
        if(null == token){
            _logger.error("token is null ...");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
        }else{
            _logger.info("access token is ok!!!");
        }
        return null;
    }
}
