package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findByAll")
    public List<User> findByAll() {
        List<User> user = userService.findByAll();
        for (User user1 : user) {
            int id = user1.getId();
            System.out.println(id);
            System.out.println("im zhw1");
        }
        return user;
    }
}
