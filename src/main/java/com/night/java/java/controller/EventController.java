package com.night.java.java.controller;

import com.night.java.java.dto.EventDTO;
import com.night.java.java.model.Event;
import com.night.java.java.service.EventService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/events")
public class EventController {

    private final EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }

    @PostMapping
    public ResponseEntity<EventDTO> register(@RequestBody EventDTO eventDTO) {
        Event event = eventDTO.toModel();
        Event savedEvent = eventService.registerOrUpdate(event);
        return ResponseEntity.ok(EventDTO.toDTO(savedEvent));
    }

    @GetMapping
    public ResponseEntity<List<EventDTO>> findAll() {
        List<EventDTO> events = eventService.findAll()
                .stream()
                .map(EventDTO::toDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(events);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventDTO> findById(@PathVariable Long id) {
        Optional<Event> event = eventService.findById(id);
        return event.map(e -> ResponseEntity.ok(EventDTO.toDTO(e)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/name/{name}")
    public ResponseEntity<EventDTO> removeByName(@PathVariable String name) {
        Optional<Event> event = eventService.removeByName(name);
        return event.map(e -> ResponseEntity.ok(EventDTO.toDTO(e)))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/tasks/start-after/{date}")
    public ResponseEntity<List<EventDTO>> searchTasksByStartAfterDate(@PathVariable String date) {
        LocalDate localDate = LocalDate.parse(date);
        List<EventDTO> events = eventService.searchTasksByStartAfterDate(localDate)
                .stream()
                .map(EventDTO::toDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(events);
    }

    @GetMapping("/between")
    public ResponseEntity<List<EventDTO>> searchEventsHappeningBetween(
            @RequestParam("startDate") String startDate,
            @RequestParam("endDate") String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        List<EventDTO> events = eventService.searchEventsHappeningBetween(start, end)
                .stream()
                .map(EventDTO::toDTO)
                .collect(Collectors.toList());
        return ResponseEntity.ok(events);
    }
}