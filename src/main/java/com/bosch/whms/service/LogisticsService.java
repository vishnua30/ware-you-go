package com.bosch.whms.service;

import java.util.List;
import java.util.Optional;

import com.bosch.whms.model.Logistics;

public interface LogisticsService {
    
    // Retrieve all drivers
    List<Logistics> getAllLogistics();
    
    // Retrieve a driver by id
    Logistics getLogisticsById(Long id);
    
    // Create a new driver
    void createLogistics(Logistics Logistics);
    
    // Update an existing driver
    void updateLogistics(Logistics Logistics);
    
    // Delete a driver by id
    void deleteLogistics(Long id);
}



