/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package com.bassure.invoiceservice.requestbody;

import com.bassure.invoiceservice.model.ResourceCategory;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/**
 *
 * @author bas200190
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public record ResourceRecord(
        @NotNull @Enumerated(EnumType.STRING) ResourceCategory resourceCategory,
        @NotNull @Size(min = 1,message = "resource name must be more than one character")String resourceName,
        @NotBlank String unit,
//        @NotNull @DecimalMin(value = "0.0", inclusive = false ,message = "gst percentage value must be more than 1%") @DecimalMax(value = "100.0", inclusive = false , message = "gst percentage value must be less than 100%")
        Double gstPercentage) {

}
