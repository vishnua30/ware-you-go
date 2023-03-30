package com.bosch.whms.service;

import java.util.List;
import java.util.Optional;

import com.bosch.whms.model.Driver;

public interface DriverService {
    
    // Retrieve all drivers
    List<Driver> getAllDrivers();
    
    // Retrieve a driver by id
    Driver getDriverById(Long id);
    
    // Create a new driver
    void createDriver(Driver driver);
    
    // Update an existing driver
    void updateDriver(Driver driver);
    
    // Delete a driver by id
    void deleteDriver(Long id);
}
