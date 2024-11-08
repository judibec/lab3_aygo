package org.example.Controller;

import org.example.models.Payment;
import org.example.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("v1/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @GetMapping("/")
    public ResponseEntity<List<Payment>> getDrivers(){
        return  ResponseEntity.ok(paymentService.getAllPayment());
    }

    @GetMapping("/{paymentId}")
    public ResponseEntity<Payment> getDriverById(@PathVariable("paymentId")String paymentId){
        return  ResponseEntity.ok(paymentService.getPaymentById(Long.valueOf(paymentId)));
    }

    @PostMapping("/")
    public ResponseEntity<Payment> createPayment(@RequestBody Payment payment) {
        Payment createdPayment = paymentService.createPayment(payment);
        return ResponseEntity.ok(createdPayment);
    }

    @PutMapping("/{paymentId}")
    public ResponseEntity<Payment> updatePayment(@PathVariable("paymentId") Long paymentId, @RequestBody Payment payment) {
        Payment updatedPayment = paymentService.updatePayment(paymentId, payment);
        if (updatedPayment != null) {
            return ResponseEntity.ok(updatedPayment);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
