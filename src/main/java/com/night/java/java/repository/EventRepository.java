package com.night.java.java.repository;

import com.night.java.java.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
    Optional<Event> findByName(String name);

    @Query("SELECT e FROM Event e WHERE e.startDate >= :startDate AND e.endDate <= :endDate")
    List<Event> searchEventsHappeningBetween(@Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate);

    @Query("SELECT e FROM Event e WHERE e.startDate > :startDate AND e.startDate <= :endDate")
    List<Event> searchTasksByStartAfterDate(@Param("startDate") LocalDate startDate,
            @Param("endDate") LocalDate endDate);
}