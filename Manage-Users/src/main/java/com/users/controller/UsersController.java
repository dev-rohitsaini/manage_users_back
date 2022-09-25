package com.users.controller;

import com.users.entity.User;
import com.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserService userSrvice;
    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {
        return this.userSrvice.createUser(user);
    }

}
