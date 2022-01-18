package com.example.MovieBookingApp.Repository;

import com.example.MovieBookingApp.Entity.Theatre;
import com.example.MovieBookingApp.Entity.TheatreSeat;
import com.example.MovieBookingApp.Entity.TheatreShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TheatreSeatRepository  extends JpaRepository<TheatreSeat ,Integer> {
    @Query("Select seat from TheatreSeat seat where seat.theatre.tid=:tid")
    List<TheatreSeat> findSeatsByTheatreId(int tid);
}
