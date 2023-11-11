package com.bassure.invoiceservice.controller;

import com.bassure.invoiceservice.model.Client;
import com.bassure.invoiceservice.model.Invoice;
import com.bassure.invoiceservice.model.InvoiceContent;
import com.bassure.invoiceservice.model.Recurrence;
import com.bassure.invoiceservice.model.Resource;
import com.bassure.invoiceservice.model.Tenant;
import com.bassure.invoiceservice.requestbody.InvoiceRecord;
import com.bassure.invoiceservice.responsebody.MessageProperties;
import com.bassure.invoiceservice.responsebody.Response;
import com.bassure.invoiceservice.responsebody.StatusCodeProperties;
import com.bassure.invoiceservice.service.InvoiceService;
import jakarta.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("invoice")
@RestController
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private StatusCodeProperties statusCodeProperties;

    @Autowired
    private MessageProperties messageProperties;

//    @PostMapping("new")
//    public ResponseEntity<Response> createInvoice(@Valid @RequestBody InvoiceRecord invoiceRecord, BindingResult errors) {
//        System.out.println("bef rec : " + invoiceRecord);
//        if (errors.hasErrors()) {
//            Map<String, String> allErrors = new HashMap();
//            errors.getAllErrors().forEach(e -> {
//                allErrors.put(((FieldError) e).getField(), e.getDefaultMessage());
//            });
//
//            return ResponseEntity.status(HttpStatusCode.valueOf(HttpStatus.NOT_ACCEPTABLE.value())).body(Response.builder().data(invoiceRecord).error(allErrors).statuscode(statusCodeProperties.getFAILED()).message(messageProperties.getFIELD_VALIDATE_MESSAGE()).build());
//
//        }
//
//        Invoice invoice = new Invoice();
//        Client client = new Client();
//        Tenant tenant = new Tenant();
//        Recurrence recurrence = new Recurrence();
//
//        List<InvoiceContent> invoiceContents = invoiceRecord.invoiceContentRecords().stream()
//                .map((invoiceContentRecord) -> {
//                    Resource resource = new Resource(0, invoiceContentRecord.resourceRecord().resourceCategory(), invoiceContentRecord.resourceRecord().resourceName(), invoiceContentRecord.resourceRecord().unit(), invoiceContentRecord.resourceRecord().gstPercentage());
//                    InvoiceContent invoiceContent = new InvoiceContent(0, null, resource, invoiceContentRecord.quantityOrHours(), invoiceContentRecord.rate(), invoiceContentRecord.discountPercentage());
//                    return invoiceContent;
//                }
//                )
//                .collect(Collectors.toList());
//        invoice.setInvoiceContent(invoiceContents);
//
//        if (Objects.nonNull(invoiceRecord.recurrenceRecord())) {
//            recurrence.setRecurrenceId(invoiceRecord.recurrenceRecord().recurrenceId());
//            invoice.setRecurrence(recurrence);
//            invoice.setReccurenceStartedAt(invoiceRecord.reccurenceStartedAt());
//            invoice.setReccurenceEndedAt(invoiceRecord.reccurenceEndedAt());
//            invoice.setRecurring(Boolean.TRUE);
//        }
//        invoice.setRecurring(Boolean.FALSE);
//        client.setClientId(invoiceRecord.clientId());
//        tenant.setTenantId(invoiceRecord.tenantId());
//        client.setTenant(tenant);
//        invoice.setClient(client);
//        invoice.setInvoiceDueDate(invoiceRecord.invoiceDueDate());
//        invoice.setInvoiceType(invoiceRecord.invoiceType());
//
//        System.out.println("rec : " + invoice);
//
//        return ResponseEntity.ok().body(Response.builder().data(invoiceService.createInvoice(invoice)).statuscode(statusCodeProperties.getSUCCESS()).message(messageProperties.getSUCCESS_MESSAGE()).build());
//    }

    @GetMapping("viewall")
    public ResponseEntity<Response> getAllInvoice() {

        return ResponseEntity.ok().body(Response.builder().data(invoiceService.getAllInvoices()).statuscode(statusCodeProperties.getSUCCESS()).message(messageProperties.getSUCCESS_MESSAGE()).build());
    }

    @GetMapping("viewall/{tenantid}")
    public ResponseEntity<Response> getAllInvoiceByTenantId(@PathVariable(name = "tenantid", required = true) Integer tenantId) {

        return ResponseEntity.ok().body(Response.builder().data(invoiceService.getAllInvoicesByTenantId(tenantId)).statuscode(statusCodeProperties.getSUCCESS()).message(messageProperties.getSUCCESS_MESSAGE()).build());
    }

    @GetMapping("viewall/{tenantid}/{clientid}")
    public ResponseEntity<Response> getAllInvoiceByClientId(@PathVariable(name = "tenantid", required = true) Integer tenantId,
            @PathVariable(name = "clientid", required = true) Integer clientId) {

        return ResponseEntity.ok().body(Response.builder().data(invoiceService.getAllInvoicesByClientId(tenantId, clientId)).statuscode(statusCodeProperties.getSUCCESS()).message(messageProperties.getSUCCESS_MESSAGE()).build());
    }

    @GetMapping("view/{tenantid}/{clientid}/{invoiceid}")
    public ResponseEntity<Response> getInvoice(@PathVariable(name = "tenantid", required = true) Integer tenantId,
            @PathVariable(name = "clientid", required = true) Integer clientId,
            @PathVariable(name = "invoiceid", required = true) Integer invoiceId) {

        return ResponseEntity.ok().body(Response.builder().data(invoiceService.getInvoice(tenantId, clientId, invoiceId)).statuscode(statusCodeProperties.getSUCCESS()).message(messageProperties.getSUCCESS_MESSAGE()).build());

    }

}
