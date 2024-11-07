package org.example.Controller;

import org.example.models.Ride;
import org.example.services.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
