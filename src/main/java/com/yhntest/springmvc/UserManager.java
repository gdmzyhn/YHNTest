package com.yhntest.springmvc;

import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

/**
 * Created by mjk on 2018/5/1.
 */
@Component
public class UserManager {

    public String getUser(){
        return "user-manager-getUser";
    }

}
