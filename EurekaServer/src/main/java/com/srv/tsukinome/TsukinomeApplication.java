package com.srv.tsukinome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TsukinomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TsukinomeApplication.class, args);
    }

}
