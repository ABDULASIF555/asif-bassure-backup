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
@Table(name="client" ,schema = "new")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "clientId")
public class Client {
    
    
    @Id
    @GeneratedValue(generator = "invoice_id_generator",strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "invoice_seq",sequenceName = "invoice_id_seq", allocationSize = 1) 
    private int clientId;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tenant_id",unique = false,referencedColumnName = "tenantId")
    private Tenant tenant;
    
    @NotNull
    private String clientName;
    
    @NotNull
    private String mobileNumber;
    
    @NotNull
    private String gstIn;
    
    @NotNull
    private String email;
    
    @NotNull
    private String status;
    
}
