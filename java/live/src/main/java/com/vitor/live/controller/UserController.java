package com.vitor.live.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.vitor.live.model.User;
import com.vitor.live.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  UserService userService;

  @PostMapping
  public User createUser(@RequestBody User user) {
    return userService.saveUser(user);
  }

  @GetMapping
  public List<User> getUser() {
    return userService.findAll();
  }

  @GetMapping("/{userid}")
  public ResponseEntity<User> getUserById(@PathVariable("userid") Long userId) throws Exception {
    return ResponseEntity
        .ok(userService.getById(userId).orElseThrow(() -> new NoSuchElementException("Element not found.")));
  }

  @PutMapping
  public User updateUser(@RequestBody User user) {
    return userService.updateUser(user);
  }

  @SuppressWarnings("unchecked")
  @DeleteMapping(value = "/{userId}")
  public ResponseEntity<User> deleteByID(@PathVariable("userId") Long userId) throws Exception {
    try {
      userService.deleteUser(userId);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return (ResponseEntity<User>) ResponseEntity.ok();
  }

}