package com.bosch.whms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.whms.model.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long>  {

}
