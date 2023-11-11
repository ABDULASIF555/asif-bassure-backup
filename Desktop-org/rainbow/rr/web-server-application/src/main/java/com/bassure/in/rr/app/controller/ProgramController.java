package com.bassure.in.rr.app.controller;

import com.bassure.in.rr.app.model.ResponseBody;
import com.bassure.in.rr.app.model.ResponseEntity;
import com.bassure.in.rr.app.model.ResponseHeader;
import com.bassure.in.rr.app.model.program.ProgramRequest;
import com.bassure.in.rr.app.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProgramController {
    
    @Autowired
    ProgramService programService;
    
    @PostMapping ("/createProgram")
    public ResponseEntity createProgram (@RequestBody ProgramRequest programRequest){
        programService.CreateProgram(programRequest);
        ResponseBody<ProgramRequest> responseBody = new ResponseBody<>();
        responseBody.setValue(programRequest);
        responseBody.setError(null);
        
        ResponseHeader responseHeader = new  ResponseHeader();
        responseHeader.setCode(200);
        
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setHeader(responseHeader);
        responseEntity.setBody(responseBody);
        
        return responseEntity;
    }
    
}
