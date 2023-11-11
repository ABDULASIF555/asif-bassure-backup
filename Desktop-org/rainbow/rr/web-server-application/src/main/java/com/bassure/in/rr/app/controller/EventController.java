/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bassure.in.rr.app.controller;

import com.bassure.in.rr.app.model.event.Event;
import com.bassure.in.rr.app.model.event.EventNotFound;
import com.bassure.in.rr.app.model.event.EventResponse;
import com.bassure.in.rr.app.service.EventService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

  @Autowired
  EventService eventService;

    @GetMapping("/events/{id}")
    public ResponseEntity<EventResponse> viewEvent(@PathVariable int id) {
        Event event = null;
        EventResponse response;
      try {
            event = eventService.getEventById(id);
            response=new EventResponse("600", "event fetch sucusessfully", event);
        } catch (EventNotFound e) {
            e.printStackTrace();
            response=new EventResponse("601", "event fetch failed sucusessfully", event);
        }
        return ResponseEntity.ok(response);

    }

    @GetMapping("/events")
    public List<Event> viewALLEvent(@PathVariable int id) {
        return eventService.getAllEvent();
    }

}
