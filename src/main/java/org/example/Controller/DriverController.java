package org.example.Controller;

import org.example.models.Driver;
import org.example.services.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/")
    public ResponseEntity<Driver> createDriver(@RequestBody Driver driver) {
        Driver createdDriver = driverService.createDriver(driver);
        return ResponseEntity.ok(createdDriver);
    }

    @PutMapping("/{driverId}")
    public ResponseEntity<Driver> updateDriver(@PathVariable("driverId") Long driverId, @RequestBody Driver driver) {
        Driver updatedDriver = driverService.updateDriver(driverId, driver);
        if (updatedDriver != null) {
            return ResponseEntity.ok(updatedDriver);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
