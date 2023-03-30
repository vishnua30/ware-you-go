package com.bosch.whms.service;

import java.util.List;
import java.util.Optional;

import com.bosch.whms.model.SafetyStockIndicator;

public interface SafetyStockIndicatorService {
    
    // Retrieve all drivers
    List<SafetyStockIndicator> getAllSafetyStockIndicator();
    
    // Retrieve a driver by id
    SafetyStockIndicator getSafetyStockIndicatorById(int id);
    
    // Create a new driver
    void createSafetyStockIndicator(SafetyStockIndicator SafetyStockIndicator);
    
    // Update an existing driver
    void updateSafetyStockIndicator(SafetyStockIndicator SafetyStockIndicator);
    
    // Delete a driver by id
    void deleteSafetyStockIndicator(int id);
}



