package com.bosch.whms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.whms.model.InLedger;

@Repository
public interface InLedgerRepository extends JpaRepository<InLedger, Long> {

}
