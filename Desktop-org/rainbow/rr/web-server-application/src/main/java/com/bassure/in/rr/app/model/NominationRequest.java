package com.bassure.in.rr.app.model;

public record NominationRequest (User nominatedBy, User nomineeId, String description, Status status){
    
}
