package org.example.repository;

import org.example.models.Driver;
import org.example.models.Position;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DriverRepository {
    private final List<Driver> drivers = new ArrayList<>();

    public DriverRepository() {
        drivers.add(new Driver(1L, "Daniel", "Lara", new Position(55.2708, 25.2048), "4848564", "Renault Sandero", "Rojo"));
        drivers.add(new Driver(2L, "ALvaro", "Murcia", new Position(13.4050, 52.5200), "7898456", "Chevrolet Spark", "Gris"));
    }

    public List<Driver> findAll() {
        return drivers;
    }

    public Driver findById(Long id) {
        return drivers.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}