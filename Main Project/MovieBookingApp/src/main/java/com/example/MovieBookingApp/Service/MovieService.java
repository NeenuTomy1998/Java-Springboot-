package com.example.MovieBookingApp.Service;

import com.example.MovieBookingApp.Entity.Movie;
import com.example.MovieBookingApp.Repository.CustomerRepository;
import com.example.MovieBookingApp.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private CustomerRepository customerRepository;

    public List<Movie> listAll(){
        return movieRepository.findAll();
    }

    public Movie findMovieDetails(int mid) {
        return movieRepository.getById(mid);
    }
}
