package com.flydean.client;

import com.flydean.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wayne
 * @version OrderClient,  2019/9/5 5:12 下午
 */
//@FeignClient(value = "openfeign-server")
@RequestMapping(path = "/order")
public interface OrderClient {

    @PostMapping("doOrder")
    public void doOrder(@RequestBody User user);
}
