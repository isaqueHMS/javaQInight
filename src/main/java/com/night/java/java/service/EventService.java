package com.night.java.java.service;

import com.night.java.java.model.Event;
import com.night.java.java.repository.EventRepository;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class EventService {


    private final EventRepository eventRepository;


    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }


    public Event registerOrUpdate(Event event) {
        return eventRepository.save(event);
    }


    public List<Event> findAll() {
        return eventRepository.findAll();
    }


    public Optional<Event> findById(Long id) {
        return eventRepository.findById(id);
    }


    public Optional<Event> removeByName(String name) {
        Optional<Event> event = eventRepository.findByName(name);
        event.ifPresent(eventRepository::delete);
        return event;
    }

    public List<Event> searchTasksByStartAfterDate(LocalDate date) {
        return eventRepository.searchEventsHappeningBetween(date, LocalDate.MAX);
    }


    public List<Event> searchEventsHappeningBetween(LocalDate startDate, LocalDate endDate) {
        return eventRepository.searchEventsHappeningBetween(startDate, endDate);
    }
}