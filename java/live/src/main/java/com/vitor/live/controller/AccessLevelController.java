package com.vitor.live.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.vitor.live.model.AccessLevel;
import com.vitor.live.service.AccessLevelService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accesslevel")
public class AccessLevelController {

  @Autowired
  AccessLevelService accessLevelService;

  @PostMapping
  public AccessLevel createAccessLevel(@RequestBody AccessLevel accessLevel) {
    return accessLevelService.saveAccessLevel(accessLevel);
  }

  @GetMapping
  public List<AccessLevel> getAccessLevel() {
    return accessLevelService.findAll();
  }

  @GetMapping("/{accesslevelid}")
  public ResponseEntity<AccessLevel> getAccessLevelById(@PathVariable("accesslevelid") Long accessLevelId)
      throws Exception {
    return ResponseEntity.ok(
        accessLevelService.getById(accessLevelId).orElseThrow(() -> new NoSuchElementException("Element not found.")));
  }

  @PutMapping
  public AccessLevel updateAccessLevel(@RequestBody AccessLevel accessLevel) {
    return accessLevelService.updateAccessLevel(accessLevel);
  }

  @SuppressWarnings("unchecked")
  @DeleteMapping(value = "/{accessLevelId}")
  public ResponseEntity<AccessLevel> deleteByID(@PathVariable("accessLevelId") Long accessLevelId) throws Exception {
    try {
      accessLevelService.deleteAccessLevel(accessLevelId);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return (ResponseEntity<AccessLevel>) ResponseEntity.ok();
  }

}