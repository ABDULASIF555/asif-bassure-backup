/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.bassure.invoiceservice.requestbody;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.math.BigDecimal;

/**
 *
 * @author bas200190
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record InvoiceContentRecord(
        @NotNull @Positive(message = "quantity or hours must be positive") Integer quantityOrHours,
        @NotNull @Positive(message = "Amount must be positive") BigDecimal rate,
//        @DecimalMin(value = "0.0", inclusive = true,message = "discount percentage value must be positive") @DecimalMax(value = "100.0", inclusive = false,message = "discount percentage not exceed 100%") 
        Double discountPercentage,
        @NotNull ResourceRecord resourceRecord) {

}
