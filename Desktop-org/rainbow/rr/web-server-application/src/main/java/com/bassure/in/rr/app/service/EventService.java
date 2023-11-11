/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.in.rr.app.service;

import com.bassure.in.rr.app.model.event.Event;
import com.bassure.in.rr.app.model.event.EventNotFound;
import com.bassure.in.rr.app.repository.EventRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {

    @Autowired
    EventRepo repo;

    public Event getEventById(int id) throws EventNotFound{
        Optional<Event> objUser = repo.findById(id);
        if(objUser.isPresent()){
          return objUser.get();
        }else{
          throw new EventNotFound("event not found");
        }
        
    }

    public List<Event> getAllEvent() throws EventNotFound{
        List<Event> allevent = repo.findAll();
         if(allevent.isEmpty()){
            return allevent;
         }
         else{
            throw new EventNotFound("events are not found");
         }
    }
}
