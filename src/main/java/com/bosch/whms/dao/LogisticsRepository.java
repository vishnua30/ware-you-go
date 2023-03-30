package com.bosch.whms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.whms.model.Logistics;

@Repository
public interface LogisticsRepository extends JpaRepository<Logistics, Long>{

}
