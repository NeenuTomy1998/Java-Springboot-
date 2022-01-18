package com.example.MovieBookingApp.Entity;

import javax.persistence.*;

@Entity
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "username")
    private String userName;
    @Column(name = "theatrename")
    private String theatreName;
    @Column(name = "showtime")
    private String showTime;
    @Column(name = "moviedate")
    private String movieDate;
    @Column(name = "ticketcount")
    private Integer ticketCount;
    @Column(name = "moviename")
    private String movieName;
    private String seats;
    private Double amount;

    public History() {

    }

    public History(String userName, String theatreName, String showTime, String movieDate, Integer ticketCount, String seats, Double amount, String movieName) {
        this.userName = userName;
        this.theatreName = theatreName;
        this.showTime = showTime;
        this.movieDate = movieDate;
        this.ticketCount = ticketCount;
        this.seats = seats;
        this.amount = amount;
        this.movieName = movieName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTheatreName() {
        return theatreName;
    }

    public void setTheatreName(String theatreName) {
        this.theatreName = theatreName;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showName) {
        this.showTime = showName;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

    public Integer getTicketCount() {
        return ticketCount;
    }

    public void setTicketCount(Integer ticketCount) {
        this.ticketCount = ticketCount;
    }

    public String getSeats() {
        return seats;
    }

    public void setSeats(String seats) {
        this.seats = seats;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
