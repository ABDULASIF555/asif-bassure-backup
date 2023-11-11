/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.CascadeType;
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
import lombok.ToString;

/**
 *
 * @author SathishKumar
 */
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "invoice",schema = "new")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "invoiceId")
public class Invoice {
    
    @Id
    @GeneratedValue(generator = "invoice_id_generator",strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "invoice_seq",sequenceName = "invoice_id_seq", allocationSize = 1)
    private int invoiceId;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="clientId",referencedColumnName = "clientId",unique= false)
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
    @JoinColumn(name="recurrenceId",referencedColumnName = "recurrenceId",unique = false)
    private Recurrence recurrenceId;
    
    @NotNull
    private BigDecimal totalAmount;
        
    private LocalDate reccurenceStartedAt;
    
  
    private LocalDate reccurenceEndedAt;
    
    private InvoiceStatus InvoiceStatus;
        
    @OneToMany(targetEntity = InvoiceContent.class,cascade = CascadeType.ALL,mappedBy = "invoiceId")
    private List<InvoiceContent> invoiceContent;
           
   
}
