package org.example.Controller;

import org.example.models.Payment;
import org.example.models.Ride;
import org.example.services.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("v1/rides")
public class RideController {
    @Autowired
    RideService rideService;

    @GetMapping("/")
    public ResponseEntity<List<Ride>> getDrivers(){
        return  ResponseEntity.ok(rideService.getAllRides());
    }

    @GetMapping("/{rideId}")
    public ResponseEntity<Ride> getDriverById(@PathVariable("rideId")String rideId){
        return  ResponseEntity.ok(rideService.getRideById(Long.valueOf(rideId)));
    }

    @PostMapping("/")
    public ResponseEntity<Ride> createRide(@RequestBody Ride ride) {
        Ride createdRide = rideService.createRide(ride);
        return ResponseEntity.ok(createdRide);
    }

    @PutMapping("/{rideId}")
    public ResponseEntity<Ride> updateRide(@PathVariable("paymentId") Long rideId, @RequestBody Ride ride) {
        Ride updatedRide = rideService.updateRide(rideId, ride);
        if (updatedRide != null) {
            return ResponseEntity.ok(updatedRide);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
