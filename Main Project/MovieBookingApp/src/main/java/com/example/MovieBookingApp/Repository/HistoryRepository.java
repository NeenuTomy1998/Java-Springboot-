package com.example.MovieBookingApp.Repository;

import com.example.MovieBookingApp.Entity.History;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface HistoryRepository extends JpaRepository<History , Integer> {

    @Query("Select history from History history where history.userName=:userName")
    List<History> findHistoryByUserId(String userName);


}
