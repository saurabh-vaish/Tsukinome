package com.srv.tsukinome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//@EnableCircuitBreaker
//@EnableHystrix
//@EnableZuulServer
//@EnableLoadTimeWeaving
// all these not need all are inside @EnableZuulProxy
@EnableZuulProxy                    /// to enable zuul serve -- internally having
public class ZuulServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServerApplication.class, args);
    }

}
