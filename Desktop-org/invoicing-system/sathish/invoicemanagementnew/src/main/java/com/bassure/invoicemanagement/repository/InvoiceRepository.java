/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.bassure.invoicemanagement.repository;

import com.bassure.invoicemanagement.model.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author bas200190
 */
public interface InvoiceRepository extends JpaRepository<Invoice,Integer>{
    
//    @Query("SELECT u FROM Invoice invoice WHERE invoice.tenantId = 1")
//    public List<Invoice>findAllByTenantId(int tenantId);
}
