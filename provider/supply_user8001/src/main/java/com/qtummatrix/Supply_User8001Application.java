package com.qtummatrix;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Supply_User8001Application {
    public static void main(String[] args) {
        SpringApplication.run(Supply_User8001Application.class,args);
    }
}
