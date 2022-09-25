package com.users.services.implementation;

import com.users.entity.User;
import com.users.repository.UserRepository;
import com.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
