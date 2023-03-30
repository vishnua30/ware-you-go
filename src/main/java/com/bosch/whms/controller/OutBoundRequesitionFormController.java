package com.bosch.whms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bosch.whms.model.OutBoundRequesitionForm;
import com.bosch.whms.service.OutBoundRequesitionFormService;

@RestController
@RequestMapping("/api/outbound")
public class OutBoundRequesitionFormController {

    @Autowired
    private OutBoundRequesitionFormService service;

    @GetMapping("/")
    public ResponseEntity<List<OutBoundRequesitionForm>> getAllOutBoundRequesitionForms() {
        List<OutBoundRequesitionForm> list = service.getAllOutBoundRequesitionForm();
        return new ResponseEntity<List<OutBoundRequesitionForm>>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OutBoundRequesitionForm> getOutBoundRequesitionFormById(@PathVariable("id") Long id) {
        OutBoundRequesitionForm entity = service.getOutBoundRequesitionFormById(id);
        return new ResponseEntity<OutBoundRequesitionForm>(entity, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Void> createOutBoundRequesitionForm(@RequestBody OutBoundRequesitionForm entity) {
        service.createOutBoundRequesitionForm(entity);
        return new ResponseEntity<Void>(HttpStatus.CREATED);
    }

    @PutMapping("/")
    public ResponseEntity<Void> updateOutBoundRequesitionForm(@RequestBody OutBoundRequesitionForm entity) {
        service.updateOutBoundRequesitionForm(entity);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOutBoundRequesitionForm(@PathVariable("id") Long id) {
        service.deleteOutBoundRequesitionForm(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
