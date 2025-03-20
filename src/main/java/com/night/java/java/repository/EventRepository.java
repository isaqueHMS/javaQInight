package com.night.java.java.repository;

import com.night.java.java.model.Event;
import org.springframework.data.jpa.repository.JpaRepository; 
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, Long> {

 
    Optional<Event> findByName(String name);


  
    // List<Event> searchEventsHappeningBetween(LocalDate startDate, LocalDate endDate);
}