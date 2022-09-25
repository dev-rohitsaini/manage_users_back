package com.users.services;

import com.users.entity.User;

import java.util.Optional;


public interface UserService {
    //creating user
    public User createUser(User user) throws Exception;
    public User getUserByUsername(String username) throws Exception;
    public void deleteUser(Long userId) throws Exception;
    public User updateUserByid(Long userId, User user) throws Exception;
}
