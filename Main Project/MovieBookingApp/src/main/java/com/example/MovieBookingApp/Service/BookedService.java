package com.example.MovieBookingApp.Service;

import com.example.MovieBookingApp.Entity.BookedSeat;
import com.example.MovieBookingApp.Repository.BookedSeatReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookedService {
@Autowired
    BookedSeatReposity bookedSeatReposity;

    public BookedSeat getBookedSeatByShowIdAndSeatId(int showId, int seatId) {
        return bookedSeatReposity.findBookedSeatByShowIdAndSeatId(showId, seatId);
    }
    public void saveTicket(BookedSeat bookedSeat1) {
        bookedSeatReposity.save(bookedSeat1);
    }

}
