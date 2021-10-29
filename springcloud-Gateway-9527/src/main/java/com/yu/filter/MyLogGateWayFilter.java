package com.yu.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @Author:Yuzhiqiang
 * @Description:
 * @Date: Create in 21:29 2021/10/29
 * @Modified By:
 */
@Component
public class MyLogGateWayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        System.out.println("*******************come in MyLogGateWayFilter *************************"+new Date());
        String uname = exchange.getRequest().getQueryParams().getFirst("uname");
        if(uname == null)
        {
            System.out.println("*****************用户名为null，非法用户*************************");
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {                 //加载这个过滤器的优先级，数字越小优先级越高
        return 0;
    }
}
