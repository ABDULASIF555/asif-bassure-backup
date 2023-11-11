/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.controller;

import com.bassure.invoicemanagement.model.Estimate;
import com.bassure.invoicemanagement.response.Body;
import com.bassure.invoicemanagement.response.Header;
import com.bassure.invoicemanagement.response.ResponseEntity;
import com.bassure.invoicemanagement.response.StatusCode;
import com.bassure.invoicemanagement.service.EstimateService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity addNewEstimate(@RequestBody Estimate estimate ){
        
        
        
        Estimate returnedEstimate =  estimateService.createEstimate(estimate);
        
        Header header = Header.builder().code(StatusCode.getSUCCESS()).build();
        Body body = Body.builder().value(returnedEstimate).build();
        return ResponseEntity.builder().header(header).body(body).build();
    }
    
    @GetMapping("viewall")
    public ResponseEntity<Estimate> getAllEstimates (){
        List<Estimate> estimates = estimateService.viewAllEstimates();
        
        Header header = Header.builder().code(StatusCode.getSUCCESS()).build();
        Body body = Body.builder().value(estimates).build();
        return ResponseEntity.builder().header(header).body(body).build();
    }
    
    @GetMapping("viewall/{tenantid}")
    public ResponseEntity getAllEstimatesForParticularTenant (@PathVariable(name = "tenantid" , required = true) Integer tenantId){
        List<Estimate> estimates = estimateService.viewAllEstimatesForTenant(tenantId);
        
        Header header = Header.builder().code(StatusCode.getSUCCESS()).build();
        Body body = Body.builder().value(estimates).build();
        return ResponseEntity.builder().header(header).body(body).build();
        
    }
    
    @GetMapping("viewall/{tenantid}/{clientid}")
    public ResponseEntity getAllEstimatesForParticularClient (@PathVariable(name = "tenantid" , required = true) Integer tenantId , 
                                                              @PathVariable(name = "clientid" , required = true) Integer clientId){
        List<Estimate> estimates = estimateService.viewAllEstimatesForParticulatClient(tenantId,clientId);
        
        Header header = Header.builder().code(StatusCode.getSUCCESS()).build();
        Body body = Body.builder().value(estimates).build();
        return ResponseEntity.builder().header(header).body(body).build();
    }
    
    @GetMapping("view/{tenantid}/{clientid}/{estimateid}")
    public ResponseEntity getParticularEstimate (@PathVariable(name = "tenantid" , required = true) Integer tenantId , 
                                                 @PathVariable(name = "clientid" , required = true) Integer clientId ,
                                                 @PathVariable(name = "estimateid" , required = true) Integer estimateId ){
        
        Estimate estimates =  estimateService.viewParticularEstimate(tenantId,clientId,estimateId);
        Header header = Header.builder().code(StatusCode.getSUCCESS()).build();
        Body body = Body.builder().value(estimates).build();
        return ResponseEntity.builder().header(header).body(body).build();
        
    }
    
    @DeleteMapping("remove/{tenantid}/{clientid}/{estimateid}")
    public String deleteParticularEstimate (@PathVariable(name = "tenantid" , required = true) Integer tenantId , 
                                            @PathVariable(name = "clientid" , required = true) Integer clientId ,
                                            @PathVariable(name = "estimateid" , required = true) Integer estimateId ){
        return estimateService.removeParticularEstimate(tenantId,clientId,estimateId);
    }
    
    
}
