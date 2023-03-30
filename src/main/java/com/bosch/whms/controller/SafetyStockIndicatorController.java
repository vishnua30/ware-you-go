package com.bosch.whms.controller;

import com.bosch.whms.model.SafetyStockIndicator;
import com.bosch.whms.service.SafetyStockIndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:4200/navbar/safety")
@RequestMapping("/safety-stock-indicator")
public class SafetyStockIndicatorController {

    @Autowired
    private SafetyStockIndicatorService safetyStockIndicatorService;

    @GetMapping("")
    public ResponseEntity<List<SafetyStockIndicator>> getAllSafetyStockIndicator() {
        List<SafetyStockIndicator> safetyStockIndicators = safetyStockIndicatorService.getAllSafetyStockIndicator();
        return ResponseEntity.ok(safetyStockIndicators);
    }

    @GetMapping("/{id}")
    public ResponseEntity<SafetyStockIndicator> getSafetyStockIndicatorById(@PathVariable("id") int id) {
        SafetyStockIndicator safetyStockIndicator = safetyStockIndicatorService.getSafetyStockIndicatorById(id);
        return ResponseEntity.ok(safetyStockIndicator);
    }

    @PostMapping("")
    public ResponseEntity<Void> createSafetyStockIndicator(@RequestBody SafetyStockIndicator safetyStockIndicator) {
        safetyStockIndicatorService.createSafetyStockIndicator(safetyStockIndicator);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateSafetyStockIndicator(@PathVariable("id") int id, @RequestBody SafetyStockIndicator safetyStockIndicator) {
        safetyStockIndicator.setSlno(id);
        safetyStockIndicatorService.updateSafetyStockIndicator(safetyStockIndicator);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSafetyStockIndicator(@PathVariable("id") int id) {
        safetyStockIndicatorService.deleteSafetyStockIndicator(id);
        return ResponseEntity.ok().build();
    }
}
