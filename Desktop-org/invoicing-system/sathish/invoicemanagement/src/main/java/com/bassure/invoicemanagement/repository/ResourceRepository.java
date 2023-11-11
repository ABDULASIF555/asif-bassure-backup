/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bassure.invoicemanagement.repository;


import com.bassure.invoicemanagement.model.Resource;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author bas200190
 */
public interface ResourceRepository extends JpaRepository<Resource,Integer>{
    
}
