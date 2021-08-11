package com.vitor.live.service;

import java.util.List;
import java.util.Optional;

import com.vitor.live.model.AccessLevel;
import com.vitor.live.repository.AccessLevelRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccessLevelService {

  @Autowired
  AccessLevelRepository accessLevelRepository;

  public AccessLevel saveAccessLevel(AccessLevel accessLevel) {
    return accessLevelRepository.save(accessLevel);
  }

  public List<AccessLevel> findAll() {
    return accessLevelRepository.findAll();
  }

  public Optional<AccessLevel> getById(Long accessLevelId) {
    return accessLevelRepository.findById(accessLevelId);
  }

  public AccessLevel updateAccessLevel(AccessLevel accessLevel) {
    return accessLevelRepository.save(accessLevel);
  }

  public void deleteAccessLevel(Long accessLevelId) {
    accessLevelRepository.deleteById(accessLevelId);
  }
}
