package com.vitor.live.service;

import java.util.List;
import java.util.Optional;

import com.vitor.live.model.User;
import com.vitor.live.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

  public User saveUser(User user) {
    return userRepository.save(user);
  }

  public List<User> findAll() {
    return userRepository.findAll();
  }

  public Optional<User> getById(Long userId) {
    return userRepository.findById(userId);
  }

  public User updateUser(User user) {
    return userRepository.save(user);
  }

  public void deleteUser(Long userId) {
    userRepository.deleteById(userId);
  }
}
