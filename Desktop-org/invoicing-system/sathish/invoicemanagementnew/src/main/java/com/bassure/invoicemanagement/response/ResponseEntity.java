/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.invoicemanagement.response;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author bas200190
 */
@Data
@Builder
public class ResponseEntity<T> {
    private Header header;
    private Body<T> body;
}
