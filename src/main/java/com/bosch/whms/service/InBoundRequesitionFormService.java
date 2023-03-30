package com.bosch.whms.service;

import java.util.List;
import java.util.Optional;

import com.bosch.whms.model.Driver;
import com.bosch.whms.model.InBoundRequesitionForm;

public interface InBoundRequesitionFormService {
    
    // Retrieve all drivers
    List<InBoundRequesitionForm> getAllInBoundRequesitionForm();
    
    // Retrieve a driver by id
    InBoundRequesitionForm getInBoundRequesitionFormById(Long id);
    
    // Create a new driver
    void createInBoundRequesitionForm(InBoundRequesitionForm ibrf);
    
    // Update an existing driver
    void updateInBoundRequesitionForm(InBoundRequesitionForm ibrf);
    
    // Delete a driver by id
    void deleteInBoundRequesitionForm(Long id);
}
