package org.example.services;

import org.example.models.Payment;
import org.example.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    @Autowired
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public List<Payment> getAllPayment() {
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Long id) {
        return paymentRepository.findById(id);
    }

    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public Payment updatePayment(Long id, Payment updatedPayment) {
        Payment existingPayment = paymentRepository.findById(id);
        if (existingPayment != null) {
            existingPayment.setAmount(updatedPayment.getAmount());
            existingPayment.setDescription(updatedPayment.getDescription());
            existingPayment.setPaymentType(updatedPayment.getPaymentType());
            existingPayment.setMoneyType(updatedPayment.getMoneyType());
            return paymentRepository.save(existingPayment);
        }
        return null;
    }
}
