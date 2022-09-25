package com.users.controller;

import com.users.entity.User;
import com.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UserService userSrvice;

    @PostMapping("/")
    public User createUser(@RequestBody User user) throws Exception {
        return this.userSrvice.createUser(user);
    }

    //fetching user data by user name----------------
    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username) throws Exception {
        return this.userSrvice.getUserByUsername(username);
    }
    //deleting user from list-------------
    @DeleteMapping("/{userId}")
    public void deleteUser(@PathVariable("userId") Long userId) throws Exception {
       this.userSrvice.deleteUser(userId);
      return;
    }
    //update method for users--------------------------------
    @PatchMapping("/{userId}")
    public User userUpdate(@RequestBody User user, @PathVariable("userId") Long userId) throws Exception {
      return this.userSrvice.updateUserByid(userId,user);

    }
}