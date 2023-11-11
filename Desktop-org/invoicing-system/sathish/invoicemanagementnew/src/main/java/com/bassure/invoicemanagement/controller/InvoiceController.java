/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.controller;

import com.bassure.invoicemanagement.model.Invoice;
import com.bassure.invoicemanagement.service.InvoiceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bas200190
 */
@RestController
@RequestMapping("invoice")
public class InvoiceController {
    
    @Autowired
    private InvoiceService invoiceService;
    
    @GetMapping("viewall/{tenantid}/{clientid}")
    public List<Invoice> getAllInvoices(@PathVariable(name = "tenantid", required = true) Integer tenantId,@PathVariable(name = "clientid",required = true) Integer clientId){
        return invoiceService.viewAllInvoices(tenantId,clientId);
    }
}
