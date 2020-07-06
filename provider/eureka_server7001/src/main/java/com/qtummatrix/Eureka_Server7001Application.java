package com.qtummatrix;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Eureka_Server7001Application {

    public static void main(String[] args) {
        SpringApplication.run(Eureka_Server7001Application.class,args);
    }
}
