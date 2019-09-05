package com.flydean.client;

import com.flydean.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wayne
 * @version UserClient,  2019/9/5 5:12 下午
 */
@FeignClient(value = "openfeign-server")
@RequestMapping(path = "/user")
public interface UserClient {

    @GetMapping("getUserName")
    public String getUserName(@RequestParam("userId") String userId);

    @GetMapping("getUserAge")
    public String getUserAge(@RequestParam("userId") String userId, @SpringQueryMap User user);
}
