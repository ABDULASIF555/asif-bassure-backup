/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bassure.asif.codewitharjun.backend.repository;

import com.bassure.asif.codewitharjun.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author bas200190
 */
@Repository
public interface UserRepository extends JpaRepository<User,String>{
    
}
