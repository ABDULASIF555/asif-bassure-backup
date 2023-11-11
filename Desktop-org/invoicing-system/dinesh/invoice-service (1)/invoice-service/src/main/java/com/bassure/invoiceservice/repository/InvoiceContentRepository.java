package com.bassure.invoiceservice.repository;

import com.bassure.invoiceservice.model.InvoiceContent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceContentRepository  extends JpaRepository<InvoiceContent,Integer>
{
    
}
