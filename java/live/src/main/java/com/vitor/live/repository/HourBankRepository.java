package com.vitor.live.repository;

import com.vitor.live.model.HourBank;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HourBankRepository extends JpaRepository<HourBank, Long> {
}
