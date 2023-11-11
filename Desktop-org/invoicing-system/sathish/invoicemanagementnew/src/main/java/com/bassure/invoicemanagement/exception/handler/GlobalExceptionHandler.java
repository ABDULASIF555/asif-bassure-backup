/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.exception.handler;

import com.bassure.invoicemanagement.exception.EstimateNotFoundException;
import com.bassure.invoicemanagement.response.Body;
import com.bassure.invoicemanagement.response.Header;
import com.bassure.invoicemanagement.response.ResponseEntity;
import com.bassure.invoicemanagement.response.StatusCode;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 * @author bas200190
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(EstimateNotFoundException.class)
    @ResponseBody
    public ResponseEntity exceptionHandler(EstimateNotFoundException exception){
        return ResponseEntity.builder().header(Header.builder().code(StatusCode.getNO_DATA()).build()).body(Body.builder().error(StatusCode.getNO_DATA_MESSAGE()).build()).build();
    }
}
