package com.example.MovieBookingApp.Entity;

import javax.persistence.*;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Double totalAmount;
    @OneToOne
    private  TheatreShow theatreShow;
    @OneToOne
    private Customer customer;


    public Payment(Double totalAmount, TheatreShow theatreShow, Customer customer) {
        this.totalAmount = totalAmount;
        this.theatreShow = theatreShow;
        this.customer = customer;
    }
    public  Payment(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public TheatreShow getTheatreShow() {
        return theatreShow;
    }

    public void setTheatreShow(TheatreShow theatreShow) {
        this.theatreShow = theatreShow;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
