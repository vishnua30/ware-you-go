package com.bosch.whms.serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.whms.dao.OutLedgerLocationRepository;
import com.bosch.whms.model.OutLedgerLocation;
import com.bosch.whms.service.OutLedgerLocationService;

@Service
public class OutLedgerLocationServiceImpl implements OutLedgerLocationService {
    
    @Autowired
    private OutLedgerLocationRepository outLedgerLocationRepository;

    @Override
    public List<OutLedgerLocation> getAllOutLedgerLocation() {
        return outLedgerLocationRepository.findAll();
    }

    @Override
    public OutLedgerLocation getOutLedgerLocationById(Long id) {
        Optional<OutLedgerLocation> optionalOutLedgerLocation = outLedgerLocationRepository.findById(id);
        if (optionalOutLedgerLocation.isPresent()) {
            return optionalOutLedgerLocation.get();
        } else {
            return null;
        }
    }

    @Override
    public void createOutLedgerLocation(OutLedgerLocation outLedgerLocation) {
        outLedgerLocationRepository.save(outLedgerLocation);
    }

    @Override
    public void updateOutLedgerLocation(OutLedgerLocation outLedgerLocation) {
        outLedgerLocationRepository.save(outLedgerLocation);
    }

    @Override
    public void deleteOutLedgerLocation(Long id) {
        outLedgerLocationRepository.deleteById(id);
    }

}
