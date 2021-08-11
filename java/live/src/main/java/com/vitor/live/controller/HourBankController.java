package com.vitor.live.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.vitor.live.model.HourBank;
import com.vitor.live.service.HourBankService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hourbank")
public class HourBankController {

  @Autowired
  HourBankService hourBankService;

  @PostMapping
  public HourBank createHourBank(@RequestBody HourBank hourBank) {
    return hourBankService.saveHourBank(hourBank);
  }

  @GetMapping
  public List<HourBank> getHourBank() {
    return hourBankService.findAll();
  }

  @GetMapping("/{hourbankid}")
  public ResponseEntity<HourBank> getHourBankById(@PathVariable("hourBankid") Long hourBankId) throws Exception {
    return ResponseEntity
        .ok(hourBankService.getById(hourBankId).orElseThrow(() -> new NoSuchElementException("Element not found.")));
  }

  @PutMapping
  public HourBank updateHourBank(@RequestBody HourBank hourBank) {
    return hourBankService.updateHourBank(hourBank);
  }

  @SuppressWarnings("unchecked")
  @DeleteMapping(value = "/{hourbankId}")
  public ResponseEntity<HourBank> deleteByID(@PathVariable("hourBankId") Long hourBankId) throws Exception {
    try {
      hourBankService.deleteHourBank(hourBankId);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return (ResponseEntity<HourBank>) ResponseEntity.ok();
  }

}