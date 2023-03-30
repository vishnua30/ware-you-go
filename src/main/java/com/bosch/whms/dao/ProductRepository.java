package com.bosch.whms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.whms.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer>{
}
