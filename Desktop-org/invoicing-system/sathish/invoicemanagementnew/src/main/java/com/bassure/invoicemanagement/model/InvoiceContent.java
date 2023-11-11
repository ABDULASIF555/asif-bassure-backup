/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.model;


import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author SathishKumar
 */
@ToString
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name="invoice_content",schema = "new")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "invoiceContentId")
public class InvoiceContent {
    
    @Id
    @GeneratedValue(generator = "invoice_content_id_generator",strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "invoice_content_seq",sequenceName = "invoice_content_id_seq", allocationSize = 1)
    private int invoiceContentId;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="invoiceId",referencedColumnName = "invoiceId",unique = false)
    private Invoice invoiceId;
    
    @JoinColumn(name="resourceId",referencedColumnName = "resourceId")
    @OneToOne(cascade = CascadeType.ALL)
    private Resource resource;
    
//   @Size(min = 1,max = 10000)
   @NotNull 
   private int quantityOrHours;
    
   @NotNull
   private BigDecimal rate;
    
   private int discountPercentage;
}
