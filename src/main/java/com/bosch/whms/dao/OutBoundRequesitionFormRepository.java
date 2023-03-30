package com.bosch.whms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.whms.model.OutBoundRequesitionForm;

@Repository
public interface OutBoundRequesitionFormRepository extends JpaRepository<OutBoundRequesitionForm, Long>{

}
