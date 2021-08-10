package com.vitor.live.service;

import java.util.List;
import java.util.Optional;

import com.vitor.live.model.WorkingDay;
import com.vitor.live.repository.WorkingDayRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkingDayService {

  @Autowired
  WorkingDayRepository workingDayRepository;

  public WorkingDay saveWorkingDay(WorkingDay workingDay) {
    return workingDayRepository.save(workingDay);
  }

  public List<WorkingDay> findAll() {
    return workingDayRepository.findAll();
  }

  public Optional<WorkingDay> getById(Long workingDayId) {
    return workingDayRepository.findById(workingDayId);
  }

  public WorkingDay updateWorkingDay(WorkingDay workingDay) {
    return workingDayRepository.save(workingDay);
  }

  public void deleteWorkingDay(Long workingDayId) {
    workingDayRepository.deleteById(workingDayId);
  }

}
