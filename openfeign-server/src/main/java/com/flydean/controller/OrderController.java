package com.flydean.controller;

import com.flydean.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wayne
 * @version OrderController,  2019/9/5 4:25 下午
 */
@Slf4j
@RestController
@RequestMapping(path = "/order")
public class OrderController {

    /**
     * PostMapping with @RequestBody
     * @param user
     */
    @PostMapping("doOrder")
    public void doOrder(@RequestBody User user){
        log.info("do order !!!!");
    }
}
