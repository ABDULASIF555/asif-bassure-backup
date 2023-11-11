package com.bassure.invoiceservice.service;

import com.bassure.invoiceservice.exception.InvoiceNotFoundException;
import com.bassure.invoiceservice.model.Invoice;
import com.bassure.invoiceservice.model.InvoiceStatus;
import com.bassure.invoiceservice.repository.InvoiceRepository;
import jakarta.transaction.Transactional;
import java.math.BigDecimal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @Transactional
    public Invoice createInvoice(Invoice invoice) {
        invoice.getInvoiceContent().stream().forEach((invCont) -> {
                    invCont.setInvoice(invoice);
                    
                    BigDecimal eachAmount = invCont.getRate().multiply(new BigDecimal(invCont.getQuantityOrHours()));
                    System.out.println("eachAmount"+eachAmount);
                    invoice.setTotalAmount(eachAmount);
                    invoice.setInvoiceStatus(InvoiceStatus.ACTIVE);
                }
        
        );
        System.out.println("Invoice from service : "+invoice);
        return invoiceRepository.save(invoice);
    }

    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }
    
    public List<Invoice> getAllInvoicesByTenantId(Integer tenantId) {
        return invoiceRepository.findAllByTenantId(tenantId);
    }
    
    public List<Invoice> getAllInvoicesByClientId(Integer tenantId , Integer clientId) {
        return invoiceRepository.findAllByClientId(tenantId,clientId);
    }
    
    public Invoice getInvoice(Integer tenantId , Integer clientId , Integer invoiceId) {
        return invoiceRepository.findById(tenantId,clientId,invoiceId).orElseThrow(() -> new InvoiceNotFoundException());
    }

    
}
