/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.asif.codewitharjun.backend.exception;

import java.util.HashMap;
import java.util.Map;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 *
 * @author bas200190
 */
@ControllerAdvice
public class UserNotFoundAdvice {
    
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public Map<String,String> exceptionHandler(UserNotFoundException exception){
        HashMap<String,String> errorMap = new HashMap<>();
        errorMap.put("errorMessage", exception.getMessage());
        return errorMap;
    }
}
