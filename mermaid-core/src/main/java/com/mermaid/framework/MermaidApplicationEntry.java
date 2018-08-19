package com.mermaid.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan({"com.mermaid.framework"})
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class MermaidApplicationEntry {
    public static void main(String[] args) {
        SpringApplication.run(MermaidApplicationEntry.class,args);
    }
}
