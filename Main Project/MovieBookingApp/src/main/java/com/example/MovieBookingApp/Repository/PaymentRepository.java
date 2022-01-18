package com.example.MovieBookingApp.Repository;

import com.example.MovieBookingApp.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository  extends JpaRepository<Payment,Integer> {
}
