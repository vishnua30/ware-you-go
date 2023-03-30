package com.bosch.whms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.whms.model.InLedgerLocation;

@Repository
public interface InLedgerLocationRepository extends JpaRepository<InLedgerLocation, Long>{

}
