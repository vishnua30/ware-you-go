package com.bosch.whms.service;

import java.util.List;
import java.util.Optional;

import com.bosch.whms.model.Driver;
import com.bosch.whms.model.InLedgerLocation;

public interface InLedgerLocationService {
    
    // Retrieve all drivers
    List<InLedgerLocation> getAllInLedgerLocation();
    
    // Retrieve a driver by id
    InLedgerLocation getInLedgerLocationById(Long id);
    
    // Create a new driver
    void createInLedgerLocation(InLedgerLocation inLedgerlocation);
    
    // Update an existing driver
    void updateInLedgerLocation(InLedgerLocation inLedgerlocation);
    
    // Delete a driver by id
    void deleteInLedgerLocation(Long id);
}
