package com.example.MovieBookingApp.Repository;

import com.example.MovieBookingApp.Entity.Customer;
import com.example.MovieBookingApp.Entity.Theatre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TheatreRepository  extends JpaRepository<Theatre,Integer> {
}
