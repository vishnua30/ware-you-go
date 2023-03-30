package com.bosch.whms.service;

import java.util.List;
import java.util.Optional;

import com.bosch.whms.model.InLedger;

public interface InLedgerService {
    
    // Retrieve all drivers
    List<InLedger> getAllInLedger();
    
    // Retrieve a driver by id
    InLedger getInLedgerById(Long id);
    
    // Create a new driver
    void createInLedger(InLedger inledger);
    
    // Update an existing driver
    void updateInLedger(InLedger inledger);
    
    // Delete a driver by id
    void deleteInLedger(Long id);
}

