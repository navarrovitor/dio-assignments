package com.vitor.live.service;

import java.util.List;
import java.util.Optional;

import com.vitor.live.model.WorkJourney;
import com.vitor.live.repository.WorkJourneyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkJourneyService {

  @Autowired
  WorkJourneyRepository workJourneyRepository;

  public WorkJourney saveWorkJourney(WorkJourney workJourney) {
    return workJourneyRepository.save(workJourney);
  }

  public List<WorkJourney> findAll() {
    return workJourneyRepository.findAll();
  }

  public Optional<WorkJourney> getById(Long workJourneyId) {
    return workJourneyRepository.findById(workJourneyId);
  }

  public WorkJourney updateWorkJourney(WorkJourney workJourney) {
    return workJourneyRepository.save(workJourney);
  }

  public void deleteWorkJourney(Long workJourneyId) {
    workJourneyRepository.deleteById(workJourneyId);
  }

}
