package com.srv.tsukinome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class TsukinomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(TsukinomeApplication.class, args);
    }

}
