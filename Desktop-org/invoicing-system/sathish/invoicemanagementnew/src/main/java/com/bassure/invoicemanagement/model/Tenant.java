/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
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
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tenant",schema = "new")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "tenantId")
public class Tenant {
    
    
    @Id
    @GeneratedValue(generator = "tenant_id_generator",strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "tenant_seq",sequenceName = "tenant_id_seq", allocationSize = 1) 
    private int tenantId;
    
    @NotNull
    private String tenantName;
    
    @NotNull
    private String mobileNumber;
    
    @NotNull
    private String gstIn;
    
    @NotNull
    private String email;
    
    @NotNull
    private String status;
    
    
    
}
