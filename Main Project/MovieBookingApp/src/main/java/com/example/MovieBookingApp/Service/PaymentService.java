package com.example.MovieBookingApp.Service;

import com.example.MovieBookingApp.Entity.Payment;
import com.example.MovieBookingApp.Entity.Seat;
import com.example.MovieBookingApp.Entity.TheatreShow;
import com.example.MovieBookingApp.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    PaymentRepository paymentRepository;
    public Payment savePayment(Payment payment) {
        return paymentRepository.save(payment);
    }


}
