package com.vitor.live.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.vitor.live.model.DataType;
import com.vitor.live.service.DataTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/datatype")
public class DataTypeController {

  @Autowired
  DataTypeService dataTypeService;

  @PostMapping
  public DataType createDataType(@RequestBody DataType dataType) {
    return dataTypeService.saveDataType(dataType);
  }

  @GetMapping
  public List<DataType> getDataType() {
    return dataTypeService.findAll();
  }

  @GetMapping("/{datatypeid}")
  public ResponseEntity<DataType> getDataTypeById(@PathVariable("dataTypeid") Long dataTypeId) throws Exception {
    return ResponseEntity
        .ok(dataTypeService.getById(dataTypeId).orElseThrow(() -> new NoSuchElementException("Element not found.")));
  }

  @PutMapping
  public DataType updateDataType(@RequestBody DataType dataType) {
    return dataTypeService.updateDataType(dataType);
  }

  @SuppressWarnings("unchecked")
  @DeleteMapping(value = "/{datatypeId}")
  public ResponseEntity<DataType> deleteByID(@PathVariable("dataTypeId") Long dataTypeId) throws Exception {
    try {
      dataTypeService.deleteDataType(dataTypeId);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return (ResponseEntity<DataType>) ResponseEntity.ok();
  }

}