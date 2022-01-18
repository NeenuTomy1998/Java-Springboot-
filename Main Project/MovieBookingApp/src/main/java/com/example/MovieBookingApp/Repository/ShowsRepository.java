package com.example.MovieBookingApp.Repository;

import com.example.MovieBookingApp.Entity.Movie;
import com.example.MovieBookingApp.Entity.TheatreShow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  ShowsRepository extends JpaRepository<TheatreShow, Integer> {
    @Query("Select theatreShow from TheatreShow theatreShow where theatreShow.movie.mid=:mid")
    List<TheatreShow> findShowsByMovieId( @Param("mid") int mid);


}

