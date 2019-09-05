package com.flydean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wayne
 * @version RegistryServerApp,  2019/9/5 4:16 下午
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryServerApp {

    public static void main(String[] args) {
        SpringApplication.run(RegistryServerApp.class, args);
    }

}
