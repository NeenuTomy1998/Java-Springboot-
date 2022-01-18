package com.example.MovieBookingApp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class BookedSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int showid;
    private int seatid;
    private int userid;

    public BookedSeat(int showid, int seatid, int userid) {
        this.showid = showid;
        this.seatid = seatid;
        this.userid = userid;
    }

    public  BookedSeat(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getShowid() {
        return showid;
    }

    public void setShowid(int showid) {
        this.showid = showid;
    }

    public int getSeatid() {
        return seatid;
    }

    public void setSeatid(int seatid) {
        this.seatid = seatid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
