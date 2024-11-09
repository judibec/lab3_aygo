package org.example.services;

import org.example.models.Driver;
import org.example.models.Position;
import org.example.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriverService {

    @Autowired
    private final DriverRepository driverRepository;

    public DriverService(DriverRepository driverRepository){
        this.driverRepository = driverRepository;
    }

    public List<Driver> getAllDrivers(){
        return driverRepository.findAll();
    }

    public Driver getDriverById(Long id){
        return driverRepository.findById(id);
    }

    public Driver createDriver(Driver driver) {
        return driverRepository.save(driver);
    }

    public Driver updateDriver(Long id, Driver updatedDriver) {
        Driver existingDriver = driverRepository.findById(id);
        if (existingDriver != null) {
            existingDriver.setName(updatedDriver.getName());
            existingDriver.setLastname(updatedDriver.getLastname());
            existingDriver.setPosition(updatedDriver.getPosition());
            existingDriver.setNumber(updatedDriver.getNumber());
            existingDriver.setCarType(updatedDriver.getCarType());
            existingDriver.setCarColor(updatedDriver.getCarColor());
            return driverRepository.save(existingDriver);
        }
        return null;
    }

    @Scheduled(fixedRate = 3000)
    public void updateDriverPositions() {
        List<Driver> drivers = new ArrayList<>(driverRepository.findAll());

        for (Driver driver : drivers) {
            Position newPosition = simulateMovement(driver.getPosition());
            driver.setPosition(newPosition);
            driverRepository.save(driver);
        }
    }

    private Position simulateMovement(Position position) {
        // Simula un pequeño cambio en latitud y longitud
        double newLatitude = position.getLatitude() + 2;
        double newLongitude = position.getLongitude() + 3;
        return new Position(newLongitude, newLatitude);
    }

}
