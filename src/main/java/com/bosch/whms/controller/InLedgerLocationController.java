package com.bosch.whms.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosch.whms.model.InLedgerLocation;
import com.bosch.whms.service.InLedgerLocationService;

@RestController
@RequestMapping("/in-ledger-locations")
public class InLedgerLocationController {

    @Autowired
    private InLedgerLocationService inLedgerLocationService;

    @GetMapping
    public ResponseEntity<List<InLedgerLocation>> getAllInLedgerLocations() {
        List<InLedgerLocation> inLedgerLocations = inLedgerLocationService.getAllInLedgerLocation();
        return new ResponseEntity<>(inLedgerLocations, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InLedgerLocation> getInLedgerLocationById(@PathVariable Long id) {
        InLedgerLocation inLedgerLocation = inLedgerLocationService.getInLedgerLocationById(id);
        return new ResponseEntity<>(inLedgerLocation, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createInLedgerLocation(@RequestBody InLedgerLocation inLedgerLocation) {
        inLedgerLocationService.createInLedgerLocation(inLedgerLocation);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateInLedgerLocation(@PathVariable int id, @RequestBody InLedgerLocation inLedgerLocation) {
        inLedgerLocation.setLedgerId(id);
        inLedgerLocationService.updateInLedgerLocation(inLedgerLocation);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInLedgerLocation(@PathVariable Long id) {
        inLedgerLocationService.deleteInLedgerLocation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

