package com.bosch.whms.service;

import java.util.List;
import java.util.Optional;

import com.bosch.whms.model.Product;

public interface ProductService {
    
    // Retrieve all drivers
    List<Product> getAllProduct();
    
    // Retrieve a driver by id
    Product getProductById(int id);
    
    // Create a new driver
    void createProduct(Product Product);
    
    // Update an existing driver
    void updateProduct(Product Product);
    
    // Delete a driver by id
    void deleteProduct(int id);
}



