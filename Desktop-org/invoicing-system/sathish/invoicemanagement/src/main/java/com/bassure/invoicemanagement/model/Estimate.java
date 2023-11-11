/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author bas200190
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "estimate",schema = "invoice_management_system_new_asif")
public class Estimate {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "estimateSequence",
            sequenceName = "estimate_estimate_id_seq", 
            allocationSize = 1)
    @Column(name = "estimate_id")
    private int estimateId;
    
    @OneToOne
    @JoinColumn(name = "client_id"
            ,referencedColumnName = "clientId"
    )
    private Client client;
    
    @NotNull
    @Column(name = "creation_date")
    private LocalDate creationDate;
    
    @Column(name = "expiry_date")
    private LocalDate expiryDate;
    
    @Column(name = "expected_delivery_date")
    private LocalDate expectedDeliveryDate;
    
    @Column(name = "total_amount")
    private double totalAmount;
    
    @NotNull
    @Column(name = "status")
    private String status;
    
    @Column(name = "reason")
    private String reason;
    
    @Column(name = "due_days")
    private int dueDays;
    
    @OneToMany(mappedBy = "estimate",cascade = CascadeType.ALL)
    private List<EstimateContent> estimateContents;
}