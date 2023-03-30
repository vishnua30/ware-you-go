package com.bosch.whms.controller;

import com.bosch.whms.model.Truck;
import com.bosch.whms.service.TruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200/navbar/truck")
@RequestMapping("/api/trucks")
public class TruckController {

    private final TruckService truckService;

    @Autowired
    public TruckController(TruckService truckService) {
        this.truckService = truckService;
    }

    @GetMapping
    public List<Truck> getAllTrucks() {
        return truckService.getAllTruck();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Truck> getTruckById(@PathVariable int id) {
        Truck truck = truckService.getTruckById(id);
        if (truck == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(truck);
    }

    @PostMapping
    public ResponseEntity<Void> createTruck(@RequestBody Truck truck) {
        truckService.createTruck(truck);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateTruck(@PathVariable int id, @RequestBody Truck truck) {
        Truck existingTruck = truckService.getTruckById(id);
        if (existingTruck == null) {
            return ResponseEntity.notFound().build();
        }
        truck.setTruckId(id);
        truckService.updateTruck(truck);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTruck(@PathVariable int id) {
        Truck existingTruck = truckService.getTruckById(id);
        if (existingTruck == null) {
            return ResponseEntity.notFound().build();
        }
        truckService.deleteTruck(id);
        return ResponseEntity.noContent().build();
    }
}
