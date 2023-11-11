/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.service;

import com.bassure.invoicemanagement.model.Invoice;
import com.bassure.invoicemanagement.repository.InvoiceRepository;
import com.bassure.invoicemanagement.repository.TenantRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bas200190
 */
@Service
public class InvoiceService {
    
    @Autowired
    private InvoiceRepository invoiceRepository;
    
    @Autowired
    private TenantRepository tenantRepository;

    public List<Invoice> viewAllInvoices(int tenantId , int clientId) {
        if (tenantRepository.existsById(tenantId)) {
//            return invoiceRepository.findAllByTenantId(tenantId);
        }
        return null;
        
    }
    
    
}
