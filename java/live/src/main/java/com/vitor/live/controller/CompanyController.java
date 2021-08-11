package com.vitor.live.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.vitor.live.model.Company;
import com.vitor.live.service.CompanyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/company")
public class CompanyController {

  @Autowired
  CompanyService companyService;

  @PostMapping
  public Company createCompany(@RequestBody Company company) {
    return companyService.saveCompany(company);
  }

  @GetMapping
  public List<Company> getCompany() {
    return companyService.findAll();
  }

  @GetMapping("/{companyid}")
  public ResponseEntity<Company> getCompanyById(@PathVariable("companyid") Long companyId) throws Exception {
    return ResponseEntity
        .ok(companyService.getById(companyId).orElseThrow(() -> new NoSuchElementException("Element not found.")));
  }

  @PutMapping
  public Company updateCompany(@RequestBody Company company) {
    return companyService.updateCompany(company);
  }

  @SuppressWarnings("unchecked")
  @DeleteMapping(value = "/{companyId}")
  public ResponseEntity<Company> deleteByID(@PathVariable("companyId") Long companyId) throws Exception {
    try {
      companyService.deleteCompany(companyId);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return (ResponseEntity<Company>) ResponseEntity.ok();
  }

}