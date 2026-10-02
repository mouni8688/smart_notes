package com.smartnotes.smart_notes.service;

import com.smartnotes.smart_notes.entity.User;
import com.smartnotes.smart_notes.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository=userRepository;
    }
    //get all users
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
    //getUser by id
    public User getUserById(Long id){
        return userRepository.findById(id)
                .orElseThrow(()->new RuntimeException("User not FOund"));
    }


    //creating user
    public User createUser(User user){
        return userRepository.save(user);
    }
    
}
