package com.bosch.whms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.whms.model.Truck;

@Repository
public interface TruckRepository extends JpaRepository<Truck, Integer>{

}
