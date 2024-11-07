package org.example.Controller;

import org.example.models.Driver;
import org.example.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("v1/drivers")
public class DriverController {
    @Autowired
    private DriverService driverService;

    @GetMapping("/")
    public ResponseEntity<List<Driver>> getDrivers(){
        return  ResponseEntity.ok(driverService.getAllDrivers());
    }

    @GetMapping("/{driverId}")
    public ResponseEntity<Driver> getDriverById(@PathVariable("driverId")String driverId){
        return  ResponseEntity.ok(driverService.getDriverById(Long.valueOf(driverId)));
    }
}
