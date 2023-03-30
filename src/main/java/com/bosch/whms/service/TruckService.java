package com.bosch.whms.service;

import java.util.List;
import java.util.Optional;

import com.bosch.whms.model.Truck;

public interface TruckService {
    
    // Retrieve all drivers
    List<Truck> getAllTruck();
    
    // Retrieve a driver by id
    Truck getTruckById(int id);
    
    // Create a new driver
    void createTruck(Truck Truck);
    
    // Update an existing driver
    void updateTruck(Truck Truck);
    
    // Delete a driver by id
    void deleteTruck(int id);
}



