package com.example.microserviceexpedition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "microservice-expedition")
public class MicroserviceExpeditionApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceExpeditionApplication.class, args);
    }

}
