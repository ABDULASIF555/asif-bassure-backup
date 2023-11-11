
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.in.rr.app.repository;

import com.bassure.in.rr.app.model.Nomination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author VaishnaviR
 */
@Repository
public interface NominationRepo extends JpaRepository<Nomination, Integer> {
}


    
    

