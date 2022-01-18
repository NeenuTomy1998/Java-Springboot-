package com.example.MovieBookingApp.Repository;

import com.example.MovieBookingApp.Entity.BookedSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookedSeatReposity extends JpaRepository<BookedSeat, Integer> {
    @Query("Select seat from BookedSeat seat where seat.showid=:showId and seat.seatid=:seatId")
    BookedSeat findBookedSeatByShowIdAndSeatId(int showId, int seatId);

}

