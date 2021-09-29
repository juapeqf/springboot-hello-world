package com.frontbackend.springboot.services;

import com.frontbackend.springboot.models.User;
import com.frontbackend.springboot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
@Component
public class UserService {
    
    @Autowired
    private UserRepository userRepository;

    public String addUser(String name, String email){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        userRepository.save(user);
        
        return "Saved";
    }
}
