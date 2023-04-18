package com.example.movie_database.models;

import javax.persistence.*;

@Entity (name = "movies")

public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int  id;
    @Column (name = "title")
    private String title;
    @Column (name = "duration")
    private int duration;
    @Column (name = "rating")
    private String rating;

    public Movie(String title, int duration, String rating) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }
    public Movie () {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
