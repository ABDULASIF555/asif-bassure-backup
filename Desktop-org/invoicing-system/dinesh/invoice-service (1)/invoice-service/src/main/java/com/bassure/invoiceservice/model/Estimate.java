/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoiceservice.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "estimate")
@JsonIdentityInfo(
   generator = ObjectIdGenerators.PropertyGenerator.class,
   property = "estimateId")
public class Estimate {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "estimateNumberSequence", sequenceName = "estimate_estimate_id_seq", allocationSize = 1)
    private Integer estimateId;
    
    @ManyToOne(cascade ={CascadeType.ALL} )
    @JoinColumn(name = "clientId")
    private Client client;
    
    @NotNull
    @Column(name = "creation_date")
    private LocalDate creationDate;
    
    @Column(name = "expiry_date")
    private LocalDate expiryDate;
    
    @Column(name = "expected_delivery_date")
    private LocalDate expectedDeliveryDate;
    
    @Column(name = "total_amount")
    private Double totalAmount;
    
    @NotNull
    @Column(name = "status")
    private String status;
    
    @Column(name = "reason")
    private String reason;
    
    @Column(name = "due_days")
    private Integer dueDays;
    
    @OneToMany(mappedBy = "estimate")
    private List<EstimateContent> estimateContents;
}