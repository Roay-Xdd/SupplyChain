package com.qtummatrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class Redis_Service8008Application {

    public static void main(String[] args) {
        SpringApplication.run(Redis_Service8008Application.class, args);
    }

}
