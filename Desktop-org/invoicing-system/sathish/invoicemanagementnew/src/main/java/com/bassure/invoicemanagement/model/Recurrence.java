/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
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
@Table(name="recurrence",schema = "new")
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,property = "recurrenceId")        
class Recurrence {
    
    @Id
    @GeneratedValue(generator = "recurrence_id_generator",strategy = GenerationType.IDENTITY)
//    @SequenceGenerator(name = "recurrence_seq",sequenceName = "recurrence_id_seq", allocationSize = 20)
    private int recurrenceId;
    
    @Enumerated(EnumType.STRING)
    private RecurringFrequency recurringFrequency;
}
