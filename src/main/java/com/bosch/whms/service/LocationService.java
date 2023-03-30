package com.bosch.whms.service;

import java.util.List;

import com.bosch.whms.model.Location;

public interface LocationService {
    
    // Retrieve all drivers
    List<Location> getAllLocation();
    
    // Retrieve a driver by id
    Location getLocationById(Long id);
    
    // Create a new driver
    void createLocation(Location Location);
    
    // Update an existing driver
    void updateLocation(Location Location);
    
    // Delete a driver by id
    void deleteLocation(Long id);
}


