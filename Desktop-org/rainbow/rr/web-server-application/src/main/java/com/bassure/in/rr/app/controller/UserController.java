/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.in.rr.app.controller;
import com.bassure.in.rr.app.model.User;
import com.bassure.in.rr.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author VaishnaviR
 */
@RestController

public class UserController {
    @Autowired
    UserService userservice;
    User user ;
  
    
    @GetMapping("/hello")
    public String getUser(){
        return "Hello world" ;
    }
    @GetMapping("/getUser/{id}")
    public User viewUser(@PathVariable int id){
     return  userservice.getUser(id);
        
    }
    
   @PostMapping("/addUser")
    public User createUser(@RequestBody User emp) {
        return userservice.createUser(emp);
    }
    
    @PutMapping("/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User user) {
        return userservice.updateUser(id, user);
    }
    
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id) {
        userservice.deleteUser(id);
    }
   
}
