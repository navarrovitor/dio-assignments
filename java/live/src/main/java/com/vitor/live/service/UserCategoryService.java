package com.vitor.live.service;

import java.util.List;
import java.util.Optional;

import com.vitor.live.model.UserCategory;
import com.vitor.live.repository.UserCategoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserCategoryService {

  @Autowired
  UserCategoryRepository userCategoryRepository;

  public UserCategory saveUserCategory(UserCategory userCategory) {
    return userCategoryRepository.save(userCategory);
  }

  public List<UserCategory> findAll() {
    return userCategoryRepository.findAll();
  }

  public Optional<UserCategory> getById(Long userCategoryId) {
    return userCategoryRepository.findById(userCategoryId);
  }

  public UserCategory updateUserCategory(UserCategory userCategory) {
    return userCategoryRepository.save(userCategory);
  }

  public void deleteUserCategory(Long userCategoryId) {
    userCategoryRepository.deleteById(userCategoryId);
  }
}
