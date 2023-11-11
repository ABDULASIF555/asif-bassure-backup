package com.bassure.in.rr.app.controller;

import com.bassure.in.rr.app.model.Nomination;
import com.bassure.in.rr.app.model.NominationRequest;
import com.bassure.in.rr.app.model.User;
import com.bassure.in.rr.app.config.AppConfig;
import com.bassure.in.rr.app.model.NominationResponseBody;
import com.bassure.in.rr.app.model.ResponseBody;
import com.bassure.in.rr.app.model.ResponseEntity;
import com.bassure.in.rr.app.model.ResponseHeader;
import com.bassure.in.rr.app.service.NominationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NominationController {
    @Autowired
    NominationService service;
    

   @PostMapping("/nominationList")
   public ResponseEntity createNomination(@RequestBody NominationRequest nominationRequest) {
    service.createNomination( nominationRequest);
    ResponseBody<NominationRequest> responseBody = new ResponseBody<>();
        responseBody.setValue(nominationRequest);
        responseBody.setError(null);

        ResponseHeader responseHeader = new ResponseHeader();
        responseHeader.setCode(200); // Success code

        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setHeader(responseHeader);
        responseEntity.setBody(responseBody);

        return responseEntity;
    }
}














//    HttpResponse response = new HttpResponse(CustomStatusCode.Success.getCode(), "Nomination created successfully");
//    return ResponseEntity.status(HttpStatus.CREATED)
//        .body(response);


    
    

