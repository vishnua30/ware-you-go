package com.bosch.whms.serviceimpl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bosch.whms.dao.LogisticsRepository;
import com.bosch.whms.model.Logistics;
import com.bosch.whms.service.LogisticsService;

@Service
@Transactional
public class LogisticsServiceImpl implements LogisticsService {
    
    @Autowired
    private LogisticsRepository logisticsRepository;

    @Override
    public List<Logistics> getAllLogistics() {
        return logisticsRepository.findAll();
    }

    @Override
    public Logistics getLogisticsById(Long id) {
        Optional<Logistics> optionalLogistics = logisticsRepository.findById(id);
        return optionalLogistics.orElse(null);
    }

    @Override
    public void createLogistics(Logistics logistics) {
        logisticsRepository.save(logistics);
    }

    @Override
    public void updateLogistics(Logistics logistics) {
        logisticsRepository.save(logistics);
    }

    @Override
    public void deleteLogistics(Long id) {
        logisticsRepository.deleteById(id);
    }

}

