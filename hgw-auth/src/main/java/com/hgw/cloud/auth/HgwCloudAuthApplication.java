package com.hgw.cloud.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@EnableDiscoveryClient
public class HgwCloudAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(HgwCloudAuthApplication.class, args);
    }
}
