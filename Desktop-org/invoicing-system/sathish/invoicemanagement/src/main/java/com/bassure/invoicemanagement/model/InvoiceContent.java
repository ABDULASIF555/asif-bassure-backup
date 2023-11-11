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
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author SathishKumar
 */
@AllArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "invoice_content", schema = "invoice_management_system_new_asif")
public class InvoiceContent {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "invoiceContentSequence",
            sequenceName = "invoice_content_invoice_content_id_seq",
            allocationSize = 1)
    @Column(name = "invoice_content_id")
    private int invoiceContentId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "invoice_id",
            referencedColumnName = "invoiceId", unique = false
    )
    private Invoice invoice;

    @JoinColumn(name = "resource_id",
            referencedColumnName = "resourceId"
    )
    @OneToOne(cascade = CascadeType.ALL)
    private Resource resource;

    private int quantityOrHours;

    @NotNull
    private BigDecimal rate;

    private int discountPercentage;
}
