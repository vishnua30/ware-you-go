package com.bosch.whms.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.whms.dao.InBoundRequesitionFormRepository;
import com.bosch.whms.model.InBoundRequesitionForm;
import com.bosch.whms.service.InBoundRequesitionFormService;

@Service
public class InBoundRequesitionFormServiceImpl implements InBoundRequesitionFormService {

    @Autowired
    private InBoundRequesitionFormRepository repository;

    @Override
    public List<InBoundRequesitionForm> getAllInBoundRequesitionForm() {
        return repository.findAll();
    }

    @Override
    public InBoundRequesitionForm getInBoundRequesitionFormById(Long id) {
        Optional<InBoundRequesitionForm> optional = repository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException("InBoundRequesitionForm not found for id :: " + id);
        }
    }

    @Override
    public void createInBoundRequesitionForm(InBoundRequesitionForm ibrf) {
        repository.save(ibrf);
    }

    @Override
    public void updateInBoundRequesitionForm(InBoundRequesitionForm ibrf) {
        repository.save(ibrf);
    }

    @Override
    public void deleteInBoundRequesitionForm(Long id) {
        repository.deleteById(id);
    }
}
