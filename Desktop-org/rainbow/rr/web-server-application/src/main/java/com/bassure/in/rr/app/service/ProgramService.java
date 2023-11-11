package com.bassure.in.rr.app.service;

import com.bassure.in.rr.app.model.program.Program;
import com.bassure.in.rr.app.model.program.ProgramRequest;
import com.bassure.in.rr.app.repository.ProgramRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramService {
    
    @Autowired
    ProgramRepository programRepo;
    
    public String CreateProgram (ProgramRequest programRequest){
        Program program = Program.builder()
                .programName(programRequest.programName())
                .programType(programRequest.programType())
                .description(programRequest.description())
                .status(programRequest.status())
//                .createdAt(programRequest.createdAt()
                .createdBy(programRequest.createdBy())
//                .updatedAt(programRequest.updatedAt()
                .updatedBy(programRequest.updatedBy()).build();
        programRepo.save(program);
        return "Program Created";
    }
}
