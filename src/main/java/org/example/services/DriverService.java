package org.example.services;

import org.example.models.Driver;
import org.example.repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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


}
