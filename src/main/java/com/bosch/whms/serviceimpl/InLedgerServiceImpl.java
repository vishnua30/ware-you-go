package com.bosch.whms.serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.whms.dao.InLedgerRepository;
import com.bosch.whms.model.InLedger;
import com.bosch.whms.service.InLedgerService;

@Service
public class InLedgerServiceImpl implements InLedgerService {

    @Autowired
    private InLedgerRepository repository;

    @Override
    public List<InLedger> getAllInLedger() {
        return repository.findAll();
    }

    @Override
    public InLedger getInLedgerById(Long id) {
        Optional<InLedger> optional = repository.findById(id);
        if (optional.isPresent()) {
            return optional.get();
        } else {
            throw new RuntimeException("InLedger not found for id :: " + id);
        }
    }

    @Override
    public void createInLedger(InLedger inledger) {
        repository.save(inledger);
    }

    @Override
    public void updateInLedger(InLedger inledger) {
        repository.save(inledger);
    }

    @Override
    public void deleteInLedger(Long id) {
        repository.deleteById(id);
    }
}

