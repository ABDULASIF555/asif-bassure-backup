/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="tenant",schema = "invoice_management_system_new_asif")
public class Tenant {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
//    @SequenceGenerator(name = "tenantSequence",
//            sequenceName = "tenant_tenant_id_seq",
//            allocationSize = 1) 
    @Column(name = "tenant_id")
    private int tenantId;
    
//    @NotNull
    private String tenantName;
    
//    @NotNull
    private String mobileNumber;
    
//    @NotNull
    private String gstIn;
    
//    @NotNull
    private String email;
    
//    @NotNull
    private String status;
    
    
    
}
