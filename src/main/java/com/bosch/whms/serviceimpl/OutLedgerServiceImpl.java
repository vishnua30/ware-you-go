package com.bosch.whms.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.whms.dao.OutLedgerRepository;
import com.bosch.whms.model.OutLedger;
import com.bosch.whms.service.OutLedgerService;

@Service
public class OutLedgerServiceImpl implements OutLedgerService {

    @Autowired
    private OutLedgerRepository outLedgerRepository;
    
    @Override
    public List<OutLedger> getAllOutLedger() {
        return outLedgerRepository.findAll();
    }

    @Override
    public OutLedger getOutLedgerById(int id) {
        Optional<OutLedger> optionalOutLedger = outLedgerRepository.findById(id);
        if (optionalOutLedger.isPresent()) {
            return optionalOutLedger.get();
        } else {
            // handle case where OutLedger with given id is not found
            throw new RuntimeException("OutLedger with id " + id + " not found");
        }
    }

    @Override
    public void createOutLedger(OutLedger outLedger) {
        outLedgerRepository.save(outLedger);
    }

    @Override
    public void updateOutLedger(OutLedger outLedger) {
        Optional<OutLedger> optionalOutLedger = outLedgerRepository.findById(outLedger.getLedgerId());
        if (optionalOutLedger.isPresent()) {
            outLedgerRepository.save(outLedger);
        } else {
            // handle case where OutLedger with given id is not found
            throw new RuntimeException("OutLedger with id " +outLedger.getLedgerId()+ " not found");
        }
    }

    @Override
    public void deleteOutLedger(int id) {
        Optional<OutLedger> optionalOutLedger = outLedgerRepository.findById(id);
        if (optionalOutLedger.isPresent()) {
            outLedgerRepository.deleteById(id);
        } else {
            // handle case where OutLedger with given id is not found
            throw new RuntimeException("OutLedger with id " + id + " not found");
        }
    }
}

