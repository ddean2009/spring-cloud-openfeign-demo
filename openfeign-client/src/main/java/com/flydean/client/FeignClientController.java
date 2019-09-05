package com.flydean.client;

import feign.Client;
import feign.Contract;
import feign.Feign;
import feign.Logger;
import feign.auth.BasicAuthRequestInterceptor;
import feign.codec.Decoder;
import feign.codec.Encoder;
import feign.slf4j.Slf4jLogger;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClientsConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

/**
 * 因为@FeignClient的value不能重复，所以需要在这里以自定义的方式来创建
 * @author wayne
 * @version FeignClientController,  2019/9/5 7:07 下午
 */
@Data
@Component
@Import(FeignClientsConfiguration.class)
public class FeignClientController {

    private OrderClient orderClient;
    private UserClient userClient;

    public FeignClientController(Decoder decoder, Encoder encoder, Client client, Contract contract) {
        this.orderClient = Feign.builder().client(client)
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                //默认是Logger.NoOpLogger
                .logger(new Slf4jLogger(OrderClient.class))
                //默认是Logger.Level.NONE
                .logLevel(Logger.Level.FULL)
                .target(OrderClient.class, "http://openfeign-server");

        this.userClient = Feign.builder().client(client)
                .encoder(encoder)
                .decoder(decoder)
                .contract(contract)
                //默认是Logger.NoOpLogger
                .logger(new Slf4jLogger(UserClient.class))
                //默认是Logger.Level.NONE
                .logLevel(Logger.Level.FULL)
                .target(UserClient.class, "http://openfeign-server");
    }
}
