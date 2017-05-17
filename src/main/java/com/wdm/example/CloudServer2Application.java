package com.wdm.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CloudServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(CloudServer2Application.class, args);
    }
}
