package com.bosch.whms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.whms.model.SafetyStockIndicator;

@Repository
public interface SafetyStockIndicatorRepository extends JpaRepository<SafetyStockIndicator, Integer>{

}
