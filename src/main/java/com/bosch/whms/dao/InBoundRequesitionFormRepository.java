package com.bosch.whms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bosch.whms.model.InBoundRequesitionForm;

@Repository
public interface InBoundRequesitionFormRepository extends JpaRepository<InBoundRequesitionForm, Long> {

}
