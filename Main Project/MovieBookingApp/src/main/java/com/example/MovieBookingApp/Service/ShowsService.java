package com.example.MovieBookingApp.Service;

import com.example.MovieBookingApp.Entity.Movie;
import com.example.MovieBookingApp.Entity.TheatreShow;
import com.example.MovieBookingApp.Repository.ShowsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShowsService {
    @Autowired
    ShowsRepository srepo;

    public List<TheatreShow> getShowsByMovieId(int mid) {
        return srepo.findShowsByMovieId(mid);
    }

    public TheatreShow getById(int sid){return  srepo.getById(sid);}
}


