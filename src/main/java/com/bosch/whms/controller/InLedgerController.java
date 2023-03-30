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

import com.bosch.whms.model.InLedger;
import com.bosch.whms.service.InLedgerService;

@RestController
@RequestMapping("/api/v1/inledger")
public class InLedgerController {

    @Autowired
    private InLedgerService inLedgerService;

    @GetMapping
    public ResponseEntity<List<InLedger>> getAllInLedger() {
        List<InLedger> inLedgers = inLedgerService.getAllInLedger();
        return new ResponseEntity<>(inLedgers, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<InLedger> getInLedgerById(@PathVariable("id") Long id) {
        InLedger inLedger = inLedgerService.getInLedgerById(id);
        return new ResponseEntity<>(inLedger, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createInLedger(@RequestBody InLedger inLedger) {
        inLedgerService.createInLedger(inLedger);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateInLedger(@PathVariable("id") int id, @RequestBody InLedger inLedger) {
        inLedger.setLedgerId(id);
        inLedgerService.updateInLedger(inLedger);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInLedger(@PathVariable("id") Long id) {
        inLedgerService.deleteInLedger(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
