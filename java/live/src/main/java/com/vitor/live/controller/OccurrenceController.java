package com.vitor.live.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.vitor.live.model.Occurrence;
import com.vitor.live.service.OccurrenceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ocurrence")
public class OccurrenceController {

  @Autowired
  OccurrenceService ocurrenceService;

  @PostMapping
  public Occurrence createOccurrence(@RequestBody Occurrence ocurrence) {
    return ocurrenceService.saveOccurrence(ocurrence);
  }

  @GetMapping
  public List<Occurrence> getOccurrence() {
    return ocurrenceService.findAll();
  }

  @GetMapping("/{ocurrenceid}")
  public ResponseEntity<Occurrence> getOccurrenceById(@PathVariable("ocurrenceid") Long ocurrenceId) throws Exception {
    return ResponseEntity
        .ok(ocurrenceService.getById(ocurrenceId).orElseThrow(() -> new NoSuchElementException("Element not found.")));
  }

  @PutMapping
  public Occurrence updateOccurrence(@RequestBody Occurrence ocurrence) {
    return ocurrenceService.updateOccurrence(ocurrence);
  }

  @SuppressWarnings("unchecked")
  @DeleteMapping(value = "/{ocurrenceId}")
  public ResponseEntity<Occurrence> deleteByID(@PathVariable("ocurrenceId") Long ocurrenceId) throws Exception {
    try {
      ocurrenceService.deleteOccurrence(ocurrenceId);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return (ResponseEntity<Occurrence>) ResponseEntity.ok();
  }

}