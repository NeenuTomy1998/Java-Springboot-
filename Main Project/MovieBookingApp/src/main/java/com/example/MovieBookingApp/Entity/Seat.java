package com.example.MovieBookingApp.Entity;

import javax.persistence.*;

@Entity
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private boolean isbooked;
    @OneToOne
    private TheatreShow theatreShow;
    @OneToOne
    private TheatreSeat theatreSeat;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="customer_id")
    private Customer customer;

    public Seat() {
    }

    public Seat(boolean isbooked, TheatreShow theatreShow, TheatreSeat theatreSeat, Customer customer) {
        this.isbooked = isbooked;
        this.theatreShow = theatreShow;
        this.theatreSeat = theatreSeat;
        this.customer =customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public TheatreSeat getTheatreSeat() {
        return theatreSeat;
    }

    public void setTheatreSeat(TheatreSeat theatreSeat) {
        this.theatreSeat = theatreSeat;
    }

    public TheatreShow getTheatreShow() {
        return theatreShow;
    }

    public void setTheatreShow(TheatreShow theatreShow) {
        this.theatreShow = theatreShow;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public boolean isIsbooked() {
        return isbooked;
    }
    public void setIsbooked(boolean isbooked) {
        this.isbooked = isbooked;
    }


}
