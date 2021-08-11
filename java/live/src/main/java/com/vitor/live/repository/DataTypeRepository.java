package com.vitor.live.repository;

import com.vitor.live.model.DataType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataTypeRepository extends JpaRepository<DataType, Long> {
}
