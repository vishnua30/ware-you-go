package com.bosch.whms.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.whms.dao.InLedgerLocationRepository;
import com.bosch.whms.model.InLedgerLocation;
import com.bosch.whms.service.InLedgerLocationService;

@Service
public class InLedgerLocationServiceImpl implements InLedgerLocationService {

    @Autowired
    private InLedgerLocationRepository repository;

    @Override
    public List<InLedgerLocation> getAllInLedgerLocation() {
        return repository.findAll();
    }

    @Override
    public InLedgerLocation getInLedgerLocationById(Long id) {
        Optional<InLedgerLocation> optional = repository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException("InLedgerLocation not found for id :: " + id);
        }
    }

    @Override
    public void createInLedgerLocation(InLedgerLocation driver) {
        repository.save(driver);
    }

    @Override
    public void updateInLedgerLocation(InLedgerLocation driver) {
        repository.save(driver);
    }

    @Override
    public void deleteInLedgerLocation(Long id) {
        repository.deleteById(id);
    }

}
