package com.gibbons.sysserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableFeignClients
@EnableEurekaClient
@EnableHystrixDashboard
@SpringBootApplication
@MapperScan("com.gibbons.sysserver.dao")
public class SysServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SysServerApplication.class, args);
    }
}
