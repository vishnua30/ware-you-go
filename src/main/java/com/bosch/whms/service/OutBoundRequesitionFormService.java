package com.bosch.whms.service;

import java.util.List;
import java.util.Optional;

import com.bosch.whms.model.OutBoundRequesitionForm;

public interface OutBoundRequesitionFormService {
    
    // Retrieve all drivers
    List<OutBoundRequesitionForm> getAllOutBoundRequesitionForm();
    
    // Retrieve a driver by id
    OutBoundRequesitionForm getOutBoundRequesitionFormById(Long id);
    
    // Create a new driver
    void createOutBoundRequesitionForm(OutBoundRequesitionForm OutBoundRequesitionForm);
    
    // Update an existing driver
    void updateOutBoundRequesitionForm(OutBoundRequesitionForm OutBoundRequesitionForm);
    
    // Delete a driver by id
    void deleteOutBoundRequesitionForm(Long id);
}



