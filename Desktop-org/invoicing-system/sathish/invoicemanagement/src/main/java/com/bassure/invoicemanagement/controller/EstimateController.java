/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.controller;

import com.bassure.invoicemanagement.model.Estimate;
import com.bassure.invoicemanagement.service.EstimateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bas200190
 */
@RestController
@RequestMapping("estimate")
public class EstimateController {
    
    @Autowired
    private EstimateService estimateService;
    
    @PostMapping("new")
    public Estimate addNewEstimate(@RequestBody Estimate estimate ){
        System.out.println("estimate from controller : "+estimate);
        System.out.println("estimate content from controller : "+estimate.getEstimateContents().get(0));
        System.out.println("resource from controller : "+estimate.getEstimateContents().get(0).getResource());
        
        return estimateService.createEstimate(estimate);
    }
}
