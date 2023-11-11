/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.bassure.invoiceservice.requestbody;

import com.bassure.invoiceservice.model.InvoiceType;
//import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;



//@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record InvoiceRecord( 
        
        @NotNull Integer clientId,
        @NotNull Integer tenantId,
        @NotNull @Enumerated(EnumType.STRING) InvoiceType invoiceType,
//        LocalDate invoiceCreatedAt,
        @NotNull(message = "due date must be present or future not past") LocalDate invoiceDueDate,
//        Boolean recurring,
        RecurrenceRecord recurrenceRecord,
//        BigDecimal totalAmount,
        LocalDate reccurenceStartedAt,
        LocalDate reccurenceEndedAt,
//        InvoiceStatus InvoiceStatus,
        @NotNull @Size(min = 1,message = "invoice must have atleast one row") List<InvoiceContentRecord> invoiceContentRecords) {
    
}
