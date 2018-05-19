package com.yhntest.springmvc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created by mjk on 2018/4/26.
 */
@Getter
@Setter
@ToString
public class User {

    private String username;

    private String password;

    private String email;

    private String phone;

    private String address;

    private Date date;

}
