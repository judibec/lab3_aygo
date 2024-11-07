package org.example.repository;

import org.example.models.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RideRepository {
    private final List<Ride> rides = new ArrayList<>();
    private final UserRepository userRepository;
    private final DriverRepository driverRepository;
    private final PaymentRepository paymentRepository;

    public RideRepository(UserRepository userRepository, DriverRepository driverRepository, PaymentRepository paymentRepository){
        this.userRepository = userRepository;
        this.driverRepository = driverRepository;
        this.paymentRepository = paymentRepository;

        User existingUser = userRepository.findById(1L);
        Driver existingDriver = driverRepository.findById(1L);
        Payment existingPayment = paymentRepository.findById(1L);

        rides.add(new Ride(1L, new Position(-0.1276, 51.5074), new Position(-0.1041, 51.7050), existingUser, existingDriver, existingPayment, "In Progress"));
    }

    public List<Ride> findAll() {
        return rides;
    }

    public Ride findById(Long id) {
        return rides.stream()
                .filter(ride -> ride.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
