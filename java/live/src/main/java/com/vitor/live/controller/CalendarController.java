package com.vitor.live.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.vitor.live.model.Calendar;
import com.vitor.live.service.CalendarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calendar")
public class CalendarController {

  @Autowired
  CalendarService calendarService;

  @PostMapping
  public Calendar createCalendar(@RequestBody Calendar calendar) {
    return calendarService.saveCalendar(calendar);
  }

  @GetMapping
  public List<Calendar> getCalendar() {
    return calendarService.findAll();
  }

  @GetMapping("/{calendarid}")
  public ResponseEntity<Calendar> getCalendarById(@PathVariable("calendarid") Long calendarId) throws Exception {
    return ResponseEntity
        .ok(calendarService.getById(calendarId).orElseThrow(() -> new NoSuchElementException("Element not found.")));
  }

  @PutMapping
  public Calendar updateCalendar(@RequestBody Calendar calendar) {
    return calendarService.updateCalendar(calendar);
  }

  @SuppressWarnings("unchecked")
  @DeleteMapping(value = "/{calendarId}")
  public ResponseEntity<Calendar> deleteByID(@PathVariable("calendarId") Long calendarId) throws Exception {
    try {
      calendarService.deleteCalendar(calendarId);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return (ResponseEntity<Calendar>) ResponseEntity.ok();
  }

}