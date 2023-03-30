package com.bosch.whms.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.whms.dao.SafetyStockIndicatorRepository;
import com.bosch.whms.model.SafetyStockIndicator;
import com.bosch.whms.service.SafetyStockIndicatorService;

@Service
public class SafetyStockIndicatorServiceImpl implements SafetyStockIndicatorService {

    @Autowired
    private SafetyStockIndicatorRepository safetyStockIndicatorRepository;
    
    @Override
    public List<SafetyStockIndicator> getAllSafetyStockIndicator() {
        return safetyStockIndicatorRepository.findAll();
    }

    @Override
    public SafetyStockIndicator getSafetyStockIndicatorById(int id) {
        Optional<SafetyStockIndicator> result = safetyStockIndicatorRepository.findById(id);
        return result.isPresent() ? result.get() : null;
    }

    @Override
    public void createSafetyStockIndicator(SafetyStockIndicator safetyStockIndicator) {
        safetyStockIndicatorRepository.save(safetyStockIndicator);
    }

    @Override
    public void updateSafetyStockIndicator(SafetyStockIndicator safetyStockIndicator) {
        safetyStockIndicatorRepository.save(safetyStockIndicator);
    }

    @Override
    public void deleteSafetyStockIndicator(int id) {
        safetyStockIndicatorRepository.deleteById(id);
    }

}
