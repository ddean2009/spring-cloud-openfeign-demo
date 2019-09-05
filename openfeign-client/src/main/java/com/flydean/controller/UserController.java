package com.flydean.controller;

import com.flydean.client.UserClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wayne
 * @version UserController,  2019/9/5 7:56 下午
 */
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("getUserName2")
    public void getUserName(){
        log.info(userClient.getUserName("100"));
    }
}
