/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.in.rr.app.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author VaishnaviR
 */
@NoArgsConstructor
@AllArgsConstructor
@Data

@Getter
@Setter
@Table(name="nomination_list")
@Entity
@Builder
public class Nomination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)        
    int id;
    @ManyToOne
    @JoinColumn(name = "nominated_by")
    private User nominatedBy;
    
    @ManyToOne
    @JoinColumn(name = "nominee_id")
    private User nominee ; 
    
    private String description;
    
    @ManyToOne
    @JoinColumn(name = "approved_by")
    private User approvedBy;
    
    @Enumerated(EnumType.STRING)
    private Status status;
    //approval status
    // vote count
}
