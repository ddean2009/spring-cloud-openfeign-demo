package com.flydean.controller;

import com.flydean.pojo.User;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wayne
 * @version UserController,  2019/9/5 4:25 下午
 */

@RestController
@RequestMapping(path = "/user")
public class UserController {

    /**
     * GetMapping example with @RequestParam
     * @param userId
     * @return userName
     */
    @GetMapping("getUserName")
    public String getUserName(@RequestParam("userId") String userId){
        if("100".equals(userId)) {
            return "张学友";
        }else{
            return "刘德华";
        }
    }

    /**
     * GetMapping example with @RequestParam and @SpringQueryMap
     * @param userId
     * @param user
     * @return userAge
     */
    @GetMapping("getUserAge")
    public String getUserAge(@RequestParam("userId") String userId, @SpringQueryMap User user){
        if("100".equals(userId)) {
            return "20";
        }else{
            return "18";
        }
    }
}
