package com.bosch.whms.controller;

import com.bosch.whms.model.Logistics;
import com.bosch.whms.service.LogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins="http://localhost:4200/navbar/log")
@RequestMapping("/api/logistics")
public class LogisticsController {

    private final LogisticsService logisticsService;

    @Autowired
    public LogisticsController(LogisticsService logisticsService) {
        this.logisticsService = logisticsService;
    }

    @GetMapping
    public List<Logistics> getAllLogistics() {
        return logisticsService.getAllLogistics();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Logistics> getLogisticsById(@PathVariable Long id) {
        Logistics logistics = logisticsService.getLogisticsById(id);
        return ResponseEntity.of(Optional.ofNullable(logistics));
    }

    @PostMapping
    public ResponseEntity<Void> createLogistics(@RequestBody Logistics logistics) {
        logisticsService.createLogistics(logistics);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateLogistics(@PathVariable int id, @RequestBody Logistics logistics) {
        logistics.setRequestId(id);
        logisticsService.updateLogistics(logistics);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteLogistics(@PathVariable Long id) {
        logisticsService.deleteLogistics(id);
        return ResponseEntity.ok().build();
    }
}
