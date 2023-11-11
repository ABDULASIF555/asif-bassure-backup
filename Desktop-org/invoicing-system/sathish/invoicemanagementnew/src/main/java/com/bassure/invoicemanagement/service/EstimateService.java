/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.service;

import com.bassure.invoicemanagement.exception.EstimateNotFoundException;
import com.bassure.invoicemanagement.model.Estimate;
import com.bassure.invoicemanagement.model.EstimateContent;
import com.bassure.invoicemanagement.repository.EstimateRepository;
import java.util.List;
import java.util.Objects;
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
    
    
    public Estimate createEstimate(Estimate estimate) {
        
        for (EstimateContent estimateContent : estimate.getEstimateContents()) {
            estimateContent.setEstimate(estimate);
        }
        
        Estimate returnedEstimate = estimateRepo.save(estimate);
        return returnedEstimate;
    }

    public List<Estimate> viewAllEstimates() {
        return estimateRepo.findAll();
    }

    public List<Estimate> viewAllEstimatesForTenant(Integer tenantId) {
        return estimateRepo.findAllByTenantId(tenantId);
    }
    
    public List<Estimate> viewAllEstimatesForParticulatClient(Integer tenantId , Integer clientId) {
        return estimateRepo.findAllByClientId(tenantId , clientId);
    }

    public Estimate viewParticularEstimate(Integer tenantId, Integer clientId, Integer estimateId) {
        return estimateRepo.findByEstimateId(tenantId , clientId , estimateId).orElseThrow(()-> new EstimateNotFoundException(estimateId));
    }

    public String removeParticularEstimate(Integer tenantId, Integer clientId, Integer estimateId) {
        estimateRepo.deleteById(estimateId);
        
        if (Objects.nonNull(estimateRepo.findByEstimateId(tenantId, clientId, estimateId)) && estimateRepo.existsById(estimateId)) {
            return "not deleted";
        }
        return "deleted successfully";
    }
}
