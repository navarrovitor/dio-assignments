package com.vitor.live.service;

import java.util.List;
import java.util.Optional;

import com.vitor.live.model.Action;
import com.vitor.live.repository.ActionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActionService {

  @Autowired
  ActionRepository actionRepository;

  public Action saveAction(Action action) {
    return actionRepository.save(action);
  }

  public List<Action> findAll() {
    return actionRepository.findAll();
  }

  public Optional<Action> getById(Long actionId) {
    return actionRepository.findById(actionId);
  }

  public Action updateAction(Action action) {
    return actionRepository.save(action);
  }

  public void deleteAction(Long actionId) {
    actionRepository.deleteById(actionId);
  }
}
