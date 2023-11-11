/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.exception;

/**
 *
 * @author bas200190
 */
public class EstimateNotFoundException extends RuntimeException{

    public EstimateNotFoundException(Integer id) {
        super("Could not found the Estimate with id "+id);
    }
    
}
