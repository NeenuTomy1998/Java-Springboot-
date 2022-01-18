package com.example.MovieBookingApp.Service;

import com.example.MovieBookingApp.Entity.Theatre;
import com.example.MovieBookingApp.Repository.TheatreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TheatreService {

    @Autowired
    TheatreRepository trepo;


    public List<Theatre> allTheatres() {
        return trepo.findAll();
    }

    public Theatre findTheatre(int tid) {
        return trepo.getById(tid);
    }
}
