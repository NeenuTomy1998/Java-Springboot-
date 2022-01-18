package com.example.MovieBookingApp.Service;

import com.example.MovieBookingApp.Entity.History;
import com.example.MovieBookingApp.Repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoryService {
    @Autowired
    HistoryRepository historyRepository;

    public void saveHistory(History history) {
        historyRepository.save(history);
    }


    public List<History> getHistoryByUserName(String userName) {
        return historyRepository.findHistoryByUserId(userName);
    }

}
