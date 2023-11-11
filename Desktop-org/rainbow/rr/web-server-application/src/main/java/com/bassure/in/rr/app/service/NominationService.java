/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.in.rr.app.service;

import com.bassure.in.rr.app.model.Nomination;
import com.bassure.in.rr.app.model.NominationRequest;
import com.bassure.in.rr.app.repository.NominationRepo;
import com.bassure.in.rr.app.config.AppConfig;
import com.bassure.in.rr.app.model.NominationResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author VaishnaviR
 */
@Service
public class NominationService {
    @Autowired
    NominationRepo repo;
    
  
    
    public String createNomination(NominationRequest nominationRequest){
     
        Nomination nomination = Nomination.builder()
                .nominatedBy(nominationRequest.nominatedBy())
                .nominee(nominationRequest.nomineeId())
                .status(nominationRequest.status())
                .description(nominationRequest.description()).build();
         repo.save(nomination) ;
         return "user created";
         
  
        
    }
//    public NominationResponseBody createUser(User users){
//        NominationResponseBody nb = new NominationResponseBody();
//        repo.save(users);
//        nb.setStatus("user created");
//        return nb;   
//    }
}
