package com.vitor.live.service;

import java.util.List;
import java.util.Optional;

import com.vitor.live.model.HourBank;
import com.vitor.live.repository.HourBankRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HourBankService {

  @Autowired
  HourBankRepository hourBankRepository;

  public HourBank saveHourBank(HourBank hourBank) {
    return hourBankRepository.save(hourBank);
  }

  public List<HourBank> findAll() {
    return hourBankRepository.findAll();
  }

  public Optional<HourBank> getById(Long hourBankId) {
    return hourBankRepository.findById(hourBankId);
  }

  public HourBank updateHourBank(HourBank hourBank) {
    return hourBankRepository.save(hourBank);
  }

  public void deleteHourBank(Long hourBankId) {
    hourBankRepository.deleteById(hourBankId);
  }
}
