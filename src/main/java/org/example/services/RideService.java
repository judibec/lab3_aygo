package org.example.services;

import org.example.models.Payment;
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

    public Ride createRide(Ride ride) {
        return rideRepository.save(ride);
    }

    public Ride updateRide(Long id, Ride updatedRide) {
        Ride existingRide = rideRepository.findById(id);
        if (existingRide != null) {
            existingRide.setOrigin(updatedRide.getOrigin());
            existingRide.setDestination(updatedRide.getDestination());
            existingRide.setUser(updatedRide.getUser());
            existingRide.setDriver(updatedRide.getDriver());
            existingRide.setPayment(updatedRide.getPayment());
            existingRide.setState(updatedRide.getState());
            return rideRepository.save(existingRide);
        }
        return null;
    }

}
