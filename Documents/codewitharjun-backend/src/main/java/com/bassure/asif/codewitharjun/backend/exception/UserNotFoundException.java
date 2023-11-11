/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.asif.codewitharjun.backend.exception;

/**
 *
 * @author bas200190
 */
public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException(String id) {
        super("Could not found the user with id "+id);
    }
    
}
