package com.bosch.whms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.whms.model.OutLedger;


@Repository
public interface OutLedgerRepository extends JpaRepository<OutLedger, Integer> {

}
