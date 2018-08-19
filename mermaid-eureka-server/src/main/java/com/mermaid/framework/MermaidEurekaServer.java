package com.mermaid.framework;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer
public class MermaidEurekaServer {
    public static void main(String[] args) {
        new SpringApplicationBuilder(MermaidEurekaServer.class).web(true).run(args);
    }
}
