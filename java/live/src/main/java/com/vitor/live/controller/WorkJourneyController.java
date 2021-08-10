package com.vitor.live.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.vitor.live.model.WorkJourney;
import com.vitor.live.service.WorkJourneyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workjourney")
public class WorkJourneyController {

  @Autowired
  WorkJourneyService workJourneyService;

  @PostMapping
  public WorkJourney createWorkJourney(@RequestBody WorkJourney workJourney) {
    return workJourneyService.saveWorkJourney(workJourney);
  }

  @GetMapping
  public List<WorkJourney> getWorkJourney() {
    return workJourneyService.findAll();
  }

  @GetMapping("/{workjourneyid}")
  public ResponseEntity<WorkJourney> getWorkJourneyById(@PathVariable("workjourneyid") Long workJourneyId)
      throws Exception {
    return ResponseEntity.ok(
        workJourneyService.getById(workJourneyId).orElseThrow(() -> new NoSuchElementException("Element not found.")));
  }
}
