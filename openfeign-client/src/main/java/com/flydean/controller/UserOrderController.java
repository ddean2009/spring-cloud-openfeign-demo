package com.flydean.controller;

import com.flydean.client.FeignClientController;
import com.flydean.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wayne
 * @version UserOrderController,  2019/9/5 7:13 下午
 */
@Slf4j
@RestController
public class UserOrderController {

    @Autowired
    private FeignClientController feignClientController;

    @GetMapping("getUserName1")
    public void getUserName(){
       log.info(feignClientController.getUserClient().getUserName("100"));
    }

    @GetMapping("getUserAge")
    public void getUserAge(){
        log.info(feignClientController.getUserClient().getUserAge("20", new User()));
    }
    @PostMapping("doOrder")
    public void doOrder(){
        feignClientController.getOrderClient().doOrder(new User());
    }
}
