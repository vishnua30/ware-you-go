package com.bosch.whms.service;

import java.util.List;
import java.util.Optional;

import com.bosch.whms.model.OutLedgerLocation;

public interface OutLedgerLocationService {
    
    // Retrieve all drivers
    List<OutLedgerLocation> getAllOutLedgerLocation();
    
    // Retrieve a driver by id
    OutLedgerLocation getOutLedgerLocationById(Long id);
    
    // Create a new driver
    void createOutLedgerLocation(OutLedgerLocation OutLedgerLocation);
    
    // Update an existing driver
    void updateOutLedgerLocation(OutLedgerLocation OutLedgerLocation);
    
    // Delete a driver by id
    void deleteOutLedgerLocation(Long id);
}



