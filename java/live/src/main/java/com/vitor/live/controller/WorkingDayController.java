package com.vitor.live.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.vitor.live.model.WorkingDay;
import com.vitor.live.service.WorkingDayService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workingday")
public class WorkingDayController {

  @Autowired
  WorkingDayService workingDayService;

  @PostMapping
  public WorkingDay createWorkingDay(@RequestBody WorkingDay workingDay) {
    return workingDayService.saveWorkingDay(workingDay);
  }

  @GetMapping
  public List<WorkingDay> getWorkingDay() {
    return workingDayService.findAll();
  }

  @GetMapping("/{workingdayid}")
  public ResponseEntity<WorkingDay> getWorkingDayById(@PathVariable("workingdayid") Long workingDayId)
      throws Exception {
    return ResponseEntity.ok(
        workingDayService.getById(workingDayId).orElseThrow(() -> new NoSuchElementException("Element not found.")));
  }
}
