package com.bosch.whms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bosch.whms.model.Location;

public interface LocationRepository extends JpaRepository<Location, Long> {

}
