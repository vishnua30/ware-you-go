package com.bosch.whms.service;

import java.util.List;
import java.util.Optional;

import com.bosch.whms.model.OutLedger;

public interface OutLedgerService {
    
    // Retrieve all drivers
    List<OutLedger> getAllOutLedger();
    
    // Retrieve a driver by id
    OutLedger getOutLedgerById(int id);
    
    // Create a new driver
    void createOutLedger(OutLedger OutLedger);
    
    // Update an existing driver
    void updateOutLedger(OutLedger OutLedger);
    
    // Delete a driver by id
    void deleteOutLedger(int id);
}



