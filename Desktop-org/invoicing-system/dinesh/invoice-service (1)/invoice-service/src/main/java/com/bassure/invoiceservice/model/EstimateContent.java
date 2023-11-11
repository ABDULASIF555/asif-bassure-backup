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
@Table(name = "estimate_content")
@JsonIdentityInfo(
   generator = ObjectIdGenerators.PropertyGenerator.class,
   property = "estimateContentId")
public class EstimateContent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "estimateContentSequence", sequenceName = "estimate_content_estimate_content_id_seq", allocationSize = 20)
    private Integer estimateContentId;
    
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="resourceId")
    private Resource resource;
    
    @NotNull
    @Column(name = "quantity_or_hours")
    private int quantityOrHours;
    
    @NotNull
    @Column(name = "rate")
    private Double rate;
    
    @Column(name = "discount_percentage")
    private Integer discountPercentage;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estimateId")
    private Estimate estimate;
}
