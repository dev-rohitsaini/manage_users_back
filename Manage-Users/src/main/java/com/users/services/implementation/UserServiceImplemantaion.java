package com.users.services.implementation;

import com.users.entity.User;
import com.users.repository.UserRepository;
import com.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImplemantaion implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) throws Exception {
//creating user--------------
      User local =  this.userRepository.findByUsername(user.getUsername());
            if(local!=null){
                System.out.print("User is aleready present");
                throw new Exception("User is already present");
            }else{
                //create user---------
              local =  this.userRepository.save(user);
            }
        return local;
    }
    //getting user by username ----------------
    @Override
    public User getUserByUsername(String username) throws Exception {
        return this.userRepository.findByUsername(username);
    }
//deleting the user by id-----------
    @Override
    public void deleteUser(Long userId) throws Exception {
     this.userRepository.deleteById(userId);
    }
    //updating the user-------------------------
    @Override
    public User updateUserByid(Long userId, User user) throws Exception{
        User user1= this.userRepository.findById(userId).get();
        user1.setPhone(user.getPhone());
        user1.setUsername(user.getUsername());
        user1.setEmail(user.getEmail());
        user1.setFirstname(user.getFirstname());
        user1.setLastname(user.getLastname());
        return this.userRepository.save(user1);
    }


}
