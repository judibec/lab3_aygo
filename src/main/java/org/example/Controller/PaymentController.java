package org.example.Controller;

import org.example.models.Payment;
import org.example.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
