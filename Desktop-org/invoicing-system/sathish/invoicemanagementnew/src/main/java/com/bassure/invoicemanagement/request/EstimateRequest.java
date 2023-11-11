/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.bassure.invoicemanagement.request;

import com.bassure.invoicemanagement.model.EstimateContent;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author bas200190
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EstimateRequest{
    private int clientId;
    private int tenantId;
    private LocalDate creationDate;
    private LocalDate expiryDate;
    private LocalDate expectedDeliveryDate;
    private double totalAmount;
    private String status;
    private int dueDays;
    
    private List<EstimateContent> estimateContents;
    
}