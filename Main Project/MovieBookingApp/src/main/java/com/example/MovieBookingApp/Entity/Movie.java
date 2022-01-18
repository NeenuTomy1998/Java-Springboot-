package com.example.MovieBookingApp.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mid;
    private String moviename;
    private String releasedate;
    private String director;
    private String actor;
    private String actress;
    private String description;
    private String theatername;
    private  String duration;
    private String type;
    private String language;


    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTheatername() {
        return theatername;
    }

    public void setTheatername(String theatername) {
        this.theatername = theatername;
    }

    public int getMid() {
        return mid;
    }
    public void setMid(int mid) {
        this.mid = mid;
    }
    public String getMname() {
        return moviename;
    }
    public void setMname(String mname) {
        this.moviename = mname;
    }
    public String getReldate() {
        return releasedate;
    }
    public void setReldate(String reldate) {
        this.releasedate = reldate;
    }
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }
    public String getActor() {
        return actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public String getActress() {
        return actress;
    }
    public void setActress(String actress) {
        this.actress = actress;
    }
    public String getDescr() {
        return description;
    }
    public void setDescr(String descr) {
        this.description = descr;
    }

//    public String getBanner() {
//        return banner;
//    }
//    public void setBanner(String banner) {
//        this.banner = banner;
//    }


}