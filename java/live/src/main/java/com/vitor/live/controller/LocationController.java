package com.vitor.live.controller;

import java.util.List;
import java.util.NoSuchElementException;

import com.vitor.live.model.Location;
import com.vitor.live.service.LocationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/location")
public class LocationController {

  @Autowired
  LocationService locationService;

  @PostMapping
  public Location createLocation(@RequestBody Location location) {
    return locationService.saveLocation(location);
  }

  @GetMapping
  public List<Location> getLocation() {
    return locationService.findAll();
  }

  @GetMapping("/{locationid}")
  public ResponseEntity<Location> getLocationById(@PathVariable("locationid") Long locationId) throws Exception {
    return ResponseEntity
        .ok(locationService.getById(locationId).orElseThrow(() -> new NoSuchElementException("Element not found.")));
  }

  @PutMapping
  public Location updateLocation(@RequestBody Location location) {
    return locationService.updateLocation(location);
  }

  @SuppressWarnings("unchecked")
  @DeleteMapping(value = "/{locationId}")
  public ResponseEntity<Location> deleteByID(@PathVariable("locationId") Long locationId) throws Exception {
    try {
      locationService.deleteLocation(locationId);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    return (ResponseEntity<Location>) ResponseEntity.ok();
  }

}