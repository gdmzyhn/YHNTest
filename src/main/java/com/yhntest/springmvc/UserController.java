package com.yhntest.springmvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @RequestMapping("/getUser")
    public User getUser(@RequestBody User user) {
        user.setPassword("123456");
        user.setDate(new Date());
        log.info("UserController-getUser:{}", user);
        return user;
    }

    @RequestMapping("/test")
    public String test() {
        log.info("UserController-test");
        return "user test success";
    }

}
