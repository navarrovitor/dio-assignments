package com.vitor.live.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.vitor.live.model.UserCategory;
import com.vitor.live.service.UserCategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usercategory")
public class UserCategoryController {

  @Autowired
  UserCategoryService userCategoryService;

  @PostMapping
  public UserCategory createUserCategory(@RequestBody UserCategory userCategory) {
    return userCategoryService.saveUserCategory(userCategory);
  }

  @GetMapping
  public List<UserCategory> getUserCategory() {
    return userCategoryService.findAll();
  }

  @GetMapping("/{usercategoryid}")
  public ResponseEntity<UserCategory> getUserCategoryById(@PathVariable("userCategoryid") Long userCategoryId)
      throws Exception {
    return ResponseEntity.ok(userCategoryService.getById(userCategoryId)
        .orElseThrow(() -> new NoSuchElementException("Element not found.")));
  }

  @PutMapping
  public UserCategory updateUserCategory(@RequestBody UserCategory userCategory) {
    return userCategoryService.updateUserCategory(userCategory);
  }

  @SuppressWarnings("unchecked")
  @DeleteMapping(value = "/{usercategoryId}")
  public ResponseEntity<UserCategory> deleteByID(@PathVariable("userCategoryId") Long userCategoryId) throws Exception {
    try {
      userCategoryService.deleteUserCategory(userCategoryId);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return (ResponseEntity<UserCategory>) ResponseEntity.ok();
  }

}