package com.vitor.live.service;

import java.util.List;
import java.util.Optional;

import com.vitor.live.model.Location;
import com.vitor.live.repository.LocationRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

  @Autowired
  LocationRepository locationRepository;

  public Location saveLocation(Location location) {
    return locationRepository.save(location);
  }

  public List<Location> findAll() {
    return locationRepository.findAll();
  }

  public Optional<Location> getById(Long locationId) {
    return locationRepository.findById(locationId);
  }

  public Location updateLocation(Location location) {
    return locationRepository.save(location);
  }

  public void deleteLocation(Long locationId) {
    locationRepository.deleteById(locationId);
  }
}
