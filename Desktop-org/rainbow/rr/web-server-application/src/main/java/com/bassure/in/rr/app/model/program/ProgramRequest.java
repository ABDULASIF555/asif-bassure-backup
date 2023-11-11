package com.bassure.in.rr.app.model.program;

import com.bassure.in.rr.app.model.User;
import java.sql.Timestamp;

public record ProgramRequest (int id, String programName,ProgramType programType, String description, ProgramStatus status, Timestamp createdAt, User createdBy, Timestamp updatedAt, User updatedBy){
    
}
