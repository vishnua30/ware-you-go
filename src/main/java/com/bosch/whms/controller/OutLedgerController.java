package com.bosch.whms.controller;

import com.bosch.whms.model.OutLedger;
import com.bosch.whms.service.OutLedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/outLedger")
public class OutLedgerController {

    @Autowired
    private OutLedgerService outLedgerService;

    @GetMapping
    public List<OutLedger> getAllOutLedger() {
        return outLedgerService.getAllOutLedger();
    }

    @GetMapping("/{id}")
    public ResponseEntity<OutLedger> getOutLedgerById(@PathVariable int id) {
        OutLedger outLedger = outLedgerService.getOutLedgerById(id);
        if (outLedger != null) {
            return new ResponseEntity<>(outLedger, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping
    public ResponseEntity<Void> createOutLedger(@RequestBody OutLedger outLedger) {
        outLedgerService.createOutLedger(outLedger);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateOutLedger(@PathVariable int id, @RequestBody OutLedger outLedger) {
        outLedger.setLedgerId(id);
        outLedgerService.updateOutLedger(outLedger);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOutLedger(@PathVariable int id) {
        outLedgerService.deleteOutLedger(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
