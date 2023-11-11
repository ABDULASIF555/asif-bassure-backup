
package com.bassure.in.rr.app.repository;

import com.bassure.in.rr.app.model.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends JpaRepository<Event,Integer> {
    
}
