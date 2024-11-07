package org.example.services;

import org.example.models.Ride;
import org.example.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideService {


    @Autowired
    private final RideRepository rideRepository;

    public RideService(RideRepository rideRepository) {
        this.rideRepository = rideRepository;
    }

    public List<Ride> getAllRides() {
        return rideRepository.findAll();
    }


    public Ride getRideById(Long id) {
        return rideRepository.findById(id);
    }

}
