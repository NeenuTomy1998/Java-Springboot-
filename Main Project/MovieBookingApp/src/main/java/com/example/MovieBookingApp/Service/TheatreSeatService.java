package com.example.MovieBookingApp.Service;

import com.example.MovieBookingApp.Entity.TheatreSeat;
import com.example.MovieBookingApp.Repository.TheatreSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TheatreSeatService {
    @Autowired
    private TheatreSeatRepository theatreSeatRepository;
    public List<TheatreSeat> getSeatsByTheatreId(int tid){
        return theatreSeatRepository.findSeatsByTheatreId(tid);
    }
    public TheatreSeat getSeatById(int id){
        return theatreSeatRepository.getById(id);
    }
}
