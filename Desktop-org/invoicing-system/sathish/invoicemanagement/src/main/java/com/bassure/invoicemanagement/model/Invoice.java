/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author SathishKumar
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "invoice",schema = "invoice_management_system_new_asif")
public class Invoice {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "invoiceSequence",
            sequenceName = "invoice_invoice_id_seq",
            allocationSize = 1)
    @Column(name = "invoice_id")
    private int invoiceId;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="client_id"
            ,referencedColumnName = "clientId",unique= false
    )
    private Client clientId;
    
    @Enumerated(EnumType.STRING)
    private InvoiceType invoiceType;
    
    
    @NotNull
    private LocalDate invoiceCreatedAt;
    
    @NotNull
    private LocalDate invoiceDueDate;
    
    @NotNull
    private boolean recurring;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="recurrence_id"
            ,referencedColumnName = "recurrenceId",unique = false
    )
    private Recurrence recurrenceId;
    
    @NotNull
    private BigDecimal totalAmount;
        
    private LocalDate reccurenceStartedAt;
    
  
    private LocalDate reccurenceEndedAt;
    
    private InvoiceStatus InvoiceStatus;
        
   @OneToMany(targetEntity = InvoiceContent.class,cascade = CascadeType.ALL,mappedBy = "invoice")
    private List<InvoiceContent> invoiceContent;
           
   
}
