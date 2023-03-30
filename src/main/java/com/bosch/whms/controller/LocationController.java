package com.bosch.whms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bosch.whms.model.Location;
import com.bosch.whms.service.LocationService;


@RestController
@CrossOrigin(origins="http://localhost:4200/navbar/product-transfer/newlocation")
@RequestMapping("/locations")
public class LocationController {

    @Autowired
    private LocationService locationService;

    @GetMapping
    public List<Location> getAllLocations() {
        return locationService.getAllLocation();
    }

    @GetMapping("/{id}")
    public Location getLocationById(@PathVariable Long id) {
        return locationService.getLocationById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createLocation(@RequestBody Location location) {
        locationService.createLocation(location);
    }

    @PutMapping("/{id}")
    public void updateLocation(@PathVariable Long id, @RequestBody Location location) {
        Location existingLocation = locationService.getLocationById(id);
        int oId=existingLocation.getLocationId();
        existingLocation=location;
        existingLocation.setLocationId(oId);
        locationService.updateLocation(existingLocation);
    }

    @DeleteMapping("/{id}")
    public void deleteLocation(@PathVariable Long id) {
        locationService.deleteLocation(id);
    }
}
