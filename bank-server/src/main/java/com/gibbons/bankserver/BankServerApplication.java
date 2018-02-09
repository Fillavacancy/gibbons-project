package com.gibbons.bankserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableFeignClients
@EnableEurekaClient
@EnableHystrixDashboard
@SpringBootApplication
public class BankServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankServerApplication.class, args);
    }
}
