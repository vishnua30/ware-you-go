package com.bosch.whms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bosch.whms.model.InBoundRequesitionForm;
import com.bosch.whms.service.InBoundRequesitionFormService;

@RestController
@RequestMapping("/api/inbound-requesition-forms")
public class InBoundRequesitionFormController {

    @Autowired
    private InBoundRequesitionFormService service;

    @GetMapping
    public List<InBoundRequesitionForm> getAllInBoundRequesitionForms() {
        return service.getAllInBoundRequesitionForm();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InBoundRequesitionForm> getInBoundRequesitionFormById(@PathVariable Long id) {
        InBoundRequesitionForm ibrf = service.getInBoundRequesitionFormById(id);
        return ResponseEntity.ok(ibrf);
    }

    @PostMapping
    public ResponseEntity<Void> createInBoundRequesitionForm(@RequestBody InBoundRequesitionForm ibrf) {
        service.createInBoundRequesitionForm(ibrf);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateInBoundRequesitionForm(@PathVariable Long id, @RequestBody InBoundRequesitionForm ibrf) {
       // ibrf.setId(id);
        service.updateInBoundRequesitionForm(ibrf);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInBoundRequesitionForm(@PathVariable Long id) {
        service.deleteInBoundRequesitionForm(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}

