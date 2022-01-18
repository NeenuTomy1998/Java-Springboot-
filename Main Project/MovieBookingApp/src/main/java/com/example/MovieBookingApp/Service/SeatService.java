package com.example.MovieBookingApp.Service;

import com.example.MovieBookingApp.Entity.Customer;
import com.example.MovieBookingApp.Entity.Seat;
import com.example.MovieBookingApp.Repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {
    @Autowired
    private SeatRepository seatRepository;

    public Seat saveSeat(Seat seat) {
        return seatRepository.save(seat);
    }
}
