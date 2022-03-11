package com.coshion.workcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class WorkcloudEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(WorkcloudEurekaApplication.class, args);
    }

}
