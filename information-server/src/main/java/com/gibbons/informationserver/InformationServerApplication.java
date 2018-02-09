package com.gibbons.informationserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableFeignClients
@EnableEurekaClient
@EnableHystrixDashboard
@SpringBootApplication
public class InformationServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(InformationServerApplication.class, args);
    }
}
