package com.vitor.live.service;

import java.util.List;
import java.util.Optional;

import com.vitor.live.model.Occurrence;
import com.vitor.live.repository.OccurrenceRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OccurrenceService {

  @Autowired
  OccurrenceRepository actionRepository;

  public Occurrence saveOccurrence(Occurrence action) {
    return actionRepository.save(action);
  }

  public List<Occurrence> findAll() {
    return actionRepository.findAll();
  }

  public Optional<Occurrence> getById(Long actionId) {
    return actionRepository.findById(actionId);
  }

  public Occurrence updateOccurrence(Occurrence action) {
    return actionRepository.save(action);
  }

  public void deleteOccurrence(Long actionId) {
    actionRepository.deleteById(actionId);
  }
}
