package com.flydean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author wayne
 * @version OpenFeignClient,  2019/9/5 5:10 下午
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class OpenFeignClient {
    public static void main(String[] args) {
        SpringApplication.run(OpenFeignClient.class, args);
    }
}
