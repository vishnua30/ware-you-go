package com.bosch.whms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bosch.whms.model.OutLedgerLocation;
import com.bosch.whms.service.OutLedgerLocationService;

@RestController
@RequestMapping("/outLedgerLocations")
public class OutLedgerLocationController {

    @Autowired
    private OutLedgerLocationService outLedgerLocationService;

    @GetMapping
    public List<OutLedgerLocation> getAllOutLedgerLocations() {
        return outLedgerLocationService.getAllOutLedgerLocation();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OutLedgerLocation> getOutLedgerLocationById(@PathVariable Long id) {
        OutLedgerLocation outLedgerLocation = outLedgerLocationService.getOutLedgerLocationById(id);
        if (outLedgerLocation == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(outLedgerLocation);
        }
    }

    @PostMapping
    public ResponseEntity<Object> createOutLedgerLocation(@RequestBody OutLedgerLocation outLedgerLocation) {
        outLedgerLocationService.createOutLedgerLocation(outLedgerLocation);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateOutLedgerLocation(@PathVariable Long id, @RequestBody OutLedgerLocation outLedgerLocation) {
        OutLedgerLocation outLedgerLocationToUpdate = outLedgerLocationService.getOutLedgerLocationById(id);
        if (outLedgerLocationToUpdate == null) {
            return ResponseEntity.notFound().build();
        } else {
            outLedgerLocationToUpdate.setId(outLedgerLocation.getId());
            outLedgerLocationToUpdate.setLocationId(outLedgerLocation.getLocationId());
            outLedgerLocationToUpdate.setOutLedger(outLedgerLocation.getOutLedger());
            outLedgerLocationService.updateOutLedgerLocation(outLedgerLocationToUpdate);
            return ResponseEntity.ok().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteOutLedgerLocation(@PathVariable Long id) {
        OutLedgerLocation outLedgerLocationToDelete = outLedgerLocationService.getOutLedgerLocationById(id);
        if (outLedgerLocationToDelete == null) {
            return ResponseEntity.notFound().build();
        } else {
            outLedgerLocationService.deleteOutLedgerLocation(id);
            return ResponseEntity.ok().build();
        }
    }

}

