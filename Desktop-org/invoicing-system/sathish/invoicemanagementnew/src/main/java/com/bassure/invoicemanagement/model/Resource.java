/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "resource",schema = "new")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "resourceId")
public class Resource {

    @Id
    @GeneratedValue(generator = "resource_id_generator", strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "resource_seq",sequenceName = "resource_id_seq",allocationSize = 1)
    private int resourceId;
    
    @Enumerated(EnumType.STRING)
    private ResourceCategory resourceCategory;
    
    @NotNull
    private String resourceName;
    
    @NotNull
    @Size(min = 1)
    private String unit;
    
    @NotNull
    private double gstPercentage;        
}
