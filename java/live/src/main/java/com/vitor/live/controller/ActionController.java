package com.vitor.live.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.vitor.live.model.Action;
import com.vitor.live.service.ActionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/action")
public class ActionController {

  @Autowired
  ActionService actionService;

  @PostMapping
  public Action createAction(@RequestBody Action action) {
    return actionService.saveAction(action);
  }

  @GetMapping
  public List<Action> getAction() {
    return actionService.findAll();
  }

  @GetMapping("/{actionid}")
  public ResponseEntity<Action> getActionById(@PathVariable("actionid") Long actionId) throws Exception {
    return ResponseEntity
        .ok(actionService.getById(actionId).orElseThrow(() -> new NoSuchElementException("Element not found.")));
  }

  @PutMapping
  public Action updateAction(@RequestBody Action action) {
    return actionService.updateAction(action);
  }

  @SuppressWarnings("unchecked")
  @DeleteMapping(value = "/{actionId}")
  public ResponseEntity<Action> deleteByID(@PathVariable("actionId") Long actionId) throws Exception {
    try {
      actionService.deleteAction(actionId);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return (ResponseEntity<Action>) ResponseEntity.ok();
  }

}