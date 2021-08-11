package com.vitor.live.service;

import java.util.List;
import java.util.Optional;

import com.vitor.live.model.DataType;
import com.vitor.live.repository.DataTypeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataTypeService {

  @Autowired
  DataTypeRepository dataTypeRepository;

  public DataType saveDataType(DataType dataType) {
    return dataTypeRepository.save(dataType);
  }

  public List<DataType> findAll() {
    return dataTypeRepository.findAll();
  }

  public Optional<DataType> getById(Long dataTypeId) {
    return dataTypeRepository.findById(dataTypeId);
  }

  public DataType updateDataType(DataType dataType) {
    return dataTypeRepository.save(dataType);
  }

  public void deleteDataType(Long dataTypeId) {
    dataTypeRepository.deleteById(dataTypeId);
  }
}
