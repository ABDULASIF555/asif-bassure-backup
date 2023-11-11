/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.asif.codewitharjun.backend.controller;

import com.bassure.asif.codewitharjun.backend.exception.UserNotFoundException;
import com.bassure.asif.codewitharjun.backend.model.User;
import com.bassure.asif.codewitharjun.backend.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bas200190
 */
@RestController
@CrossOrigin()
public class UserController {
    @Autowired 
    private UserRepository userRepo;
    
    
    @PostMapping("/user")
    public User addUser(@RequestBody User user){
        return userRepo.save(user);
    }
     
    @GetMapping("/users")
    public List<User> getUsers(){
        return userRepo.findAll();
    } 
    
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable String id){
        
        return userRepo.findById(id).orElseThrow(()-> new UserNotFoundException(id));
    }
    
    @PutMapping("/user/{id}")
    public User updateUserById(@RequestBody User newUser , @PathVariable String id){
        return userRepo.findById(id).map(user -> {user.setName(newUser.getName());
                                           user.setUserName(newUser.getUserName());
                                           user.setEmail(newUser.getEmail());
                                           return userRepo.save(user);
                              }).orElseThrow(()->new UserNotFoundException(id));
    }
    
    @DeleteMapping("/deleteuser/{id}")
    public String deleteUserById(@PathVariable String id){
        if (!userRepo.existsById(id)) {
            throw new UserNotFoundException(id);
        }
            userRepo.deleteById(id);
            return "User with id "+id+" has been deleted successfully!";
    }
}
