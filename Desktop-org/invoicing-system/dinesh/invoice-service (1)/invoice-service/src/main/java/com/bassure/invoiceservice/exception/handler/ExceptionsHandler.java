package com.bassure.invoiceservice.exception.handler;

import com.bassure.invoiceservice.exception.InvoiceNotFoundException;
import com.bassure.invoiceservice.responsebody.MessageProperties;
import com.bassure.invoiceservice.responsebody.Response;
import com.bassure.invoiceservice.responsebody.StatusCodeProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionsHandler {

    @Autowired
    private MessageProperties messageProperties;
    @Autowired
    private StatusCodeProperties statuscodeProperties;

    @ExceptionHandler(InvoiceNotFoundException.class)
    public ResponseEntity<Response> invoiceNotFound() {

        return ResponseEntity.status(HttpStatusCode.valueOf(HttpStatus.NO_CONTENT.value())).body(Response.builder().statuscode(statuscodeProperties.getNO_DATA()).message(messageProperties.getNO_DATA_MESSAGE()).build());
    }

}
