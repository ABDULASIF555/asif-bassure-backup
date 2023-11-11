/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
@Table(name = "estimate_content",schema = "new")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "estimateContentId")

public class EstimateContent {
    @Id
    @Column(name = "estimate_content_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "estimateContentSequence", sequenceName = "estimate_content_estimate_content_id_seq", allocationSize = 1)
    private int estimateContentId;
    
    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="resource_id",referencedColumnName = "resourceId",unique = false)
    private Resource resource;
    
    @NotNull
    @Column(name = "quantity_or_hours")
    private int quantityOrHours;
    
    @NotNull
    @Column(name = "rate")
    private double rate;
    
    @Column(name = "discount_percentage")
    private int discountPercentage;
    
    @JsonIgnore
//    @JsonBackReference
    @ManyToOne()
    @JoinColumn(name = "estimate_id",referencedColumnName = "estimateId")
    private Estimate estimate;
}
