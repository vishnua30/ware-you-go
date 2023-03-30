package com.bosch.whms.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosch.whms.dao.TruckRepository;
import com.bosch.whms.model.Truck;
import com.bosch.whms.service.TruckService;

@Service
public class TruckServiceImpl implements TruckService {

    @Autowired
    private TruckRepository truckRepository;
    
    @Override
    public List<Truck> getAllTruck() {
        return truckRepository.findAll();
    }

    @Override
    public Truck getTruckById(int id) {
        Optional<Truck> optionalTruck = truckRepository.findById(id);
        return optionalTruck.isPresent() ? optionalTruck.get() : null;
    }

    @Override
    public void createTruck(Truck truck) {
        truckRepository.save(truck);
    }

    @Override
    public void updateTruck(Truck truck) {
        truckRepository.save(truck);
    }

    @Override
    public void deleteTruck(int id) {
        truckRepository.deleteById(id);
    }

}
