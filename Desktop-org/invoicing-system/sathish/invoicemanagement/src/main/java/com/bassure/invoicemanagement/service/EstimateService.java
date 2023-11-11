/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.service;

import com.bassure.invoicemanagement.model.Estimate;
import com.bassure.invoicemanagement.model.EstimateContent;
import com.bassure.invoicemanagement.repository.EstimateRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bas200190
 */
@Service
public class EstimateService {
    @Autowired
    private EstimateRepository estimateRepo;
    
    @Transactional
    public Estimate createEstimate(Estimate estimate) {
        System.out.println(estimate);
        for (EstimateContent estCont : estimate.getEstimateContents()) {
            estCont.getEstimate().setEstimateId(estimate.getEstimateId());
            System.out.println("each est cont from service"+estCont);
        }
        
        Estimate returnedEstimate = estimateRepo.save(estimate);
        System.out.println("Returned Estimate : "+returnedEstimate);
        return returnedEstimate;
    }
}
