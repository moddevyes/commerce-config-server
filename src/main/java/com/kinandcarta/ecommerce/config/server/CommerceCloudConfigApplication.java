package com.kinandcarta.ecommerce.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CommerceCloudConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommerceCloudConfigApplication.class, args);
    }

}
