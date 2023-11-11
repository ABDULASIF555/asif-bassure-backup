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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "estimate_content",schema = "invoice_management_system_new_asif")
public class EstimateContent {
    @Id
    @Column(name = "estimate_content_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "estimateContentSequence",
            sequenceName = "estimate_content_estimate_content_id_seq", 
            allocationSize = 1)
    private int estimateContentId;
    
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="resource_id"
            ,referencedColumnName = "resourceId"
    )
    private Resource resource;
    
    @NotNull
    @Column(name = "quantity_or_hours")
    private int quantityOrHours;
    
    @NotNull
    @Column(name = "rate")
    private double rate;
    
    @Column(name = "discount_percentage")
    private int discountPercentage;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estimate_id")
    private Estimate estimate;
}
