package com.vitor.live.service;

import java.util.List;
import java.util.Optional;

import com.vitor.live.model.Calendar;
import com.vitor.live.repository.CalendarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarService {

  @Autowired
  CalendarRepository calendarRepository;

  public Calendar saveCalendar(Calendar calendar) {
    return calendarRepository.save(calendar);
  }

  public List<Calendar> findAll() {
    return calendarRepository.findAll();
  }

  public Optional<Calendar> getById(Long calendarId) {
    return calendarRepository.findById(calendarId);
  }

  public Calendar updateCalendar(Calendar calendar) {
    return calendarRepository.save(calendar);
  }

  public void deleteCalendar(Long calendarId) {
    calendarRepository.deleteById(calendarId);
  }
}
