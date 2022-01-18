package com.example.MovieBookingApp.Entity;

import javax.persistence.*;

@Entity
public class TheatreSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="theatre_tid")
    private Theatre theatre;
    private int type;

    public TheatreSeat(int id, String name, Theatre theatre, int type) {
        this.id = id;
        this.name = name;
        this.theatre = theatre;
        this.type = type;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public TheatreSeat(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Theatre getTheatre() {
        return theatre;
    }

    public void setTheatre(Theatre theatre) {
        this.theatre = theatre;
    }
}
