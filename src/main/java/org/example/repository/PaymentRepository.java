package org.example.repository;

import org.example.models.Payment;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentRepository {
    private final List<Payment> payments = new ArrayList<>();

    public PaymentRepository(){
        payments.add(new Payment(1L, "50000", "viaje desde arturo calle hasta jumbo 80", "Efectivo", "Peso Colombiano"));
        payments.add(new Payment(2L, "15000", "viaje desde titan plaza hasta gran estacion", "Tarjeta", "Peso Colombiano"));
    }

    public List<Payment> findAll() {
        return payments;
    }

    public Payment findById(Long id) {
        return payments.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
