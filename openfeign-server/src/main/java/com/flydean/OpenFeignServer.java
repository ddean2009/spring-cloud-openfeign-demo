package com.flydean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wayne
 * @version OpenFeignServer,  2019/9/5 4:22 下午
 */

@SpringBootApplication
@EnableDiscoveryClient
public class OpenFeignServer {
        public static void main(String[] args) {
            SpringApplication.run(OpenFeignServer.class, args);
    }
}
