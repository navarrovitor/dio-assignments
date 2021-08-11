package com.vitor.live.service;

import java.util.List;
import java.util.Optional;

import com.vitor.live.model.Company;
import com.vitor.live.repository.CompanyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyService {

  @Autowired
  CompanyRepository companyRepository;

  public Company saveCompany(Company company) {
    return companyRepository.save(company);
  }

  public List<Company> findAll() {
    return companyRepository.findAll();
  }

  public Optional<Company> getById(Long companyId) {
    return companyRepository.findById(companyId);
  }

  public Company updateCompany(Company company) {
    return companyRepository.save(company);
  }

  public void deleteCompany(Long companyId) {
    companyRepository.deleteById(companyId);
  }
}
