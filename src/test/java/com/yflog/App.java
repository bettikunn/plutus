package com.yflog;

import com.yflog.entity.User;
import com.yflog.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by vincent on 9/28/16.
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        context.start();

        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setEmail("meds2sx@yflxog.com");
        user.setPassword("tzhagd");
        user.setUsername("zvcxaaxxxxx");

        userService.save(user);


        System.out.println(user);

        User user2 = userService.getById(user.getId());
        System.out.println(user2);

        user2 = userService.getByUserName(user.getUsername());
        System.out.println(user2);


        user2 = userService.getByEmail(user.getEmail());
        System.out.println(user2);

        user2 = userService.getByEmail("not@sds");
        System.out.println(user2);
    }
}
