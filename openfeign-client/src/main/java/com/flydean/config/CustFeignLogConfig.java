package com.flydean.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author wayne
 * @version CustFeignLogConfig,  2019/9/5 7:32 下午
 */
@Configuration
public class CustFeignLogConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
