package com.yflog.service;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by vincent on 9/28/16.
 */
public class Services {

    private Services() {}
    private static Services instance = new Services();
    public static Services getInstance() {
        return instance;
    }

    @Autowired
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }
}
