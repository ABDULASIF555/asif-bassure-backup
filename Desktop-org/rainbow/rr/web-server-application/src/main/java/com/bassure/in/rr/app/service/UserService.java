/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.in.rr.app.service;

import com.bassure.in.rr.app.model.User;

import com.bassure.in.rr.app.repository.UserRepo;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author VaishnaviR
 */
@Service
public class UserService {
    @Autowired
    UserRepo repo;
//    User user;
    
   
  public User createUser(User user) {
       return repo.save(user);
  }
  
  public User getUser(int id){
   Optional<User>objUser = repo.findById(id);
   return  objUser.orElse(null);
  }
  
  public User updateUser(int id, User user) {
        if (repo.existsById(id)) { 
            return repo.save(user);
            
        } else {
           return null;
        }
  }
  
   public void deleteUser(int id) {
        if (repo.existsById(id)) {
           repo.deleteById(id);
        } else {
            System.out.println("NO user to delete");
        }
}
}
