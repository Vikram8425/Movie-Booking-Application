package com.moving.Boking.Payload;

import com.moving.Boking.Model.Screen;


import java.util.Date;

public class MovieDto{
    private int id;
    private String title;
    private Date releaseDate;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

   
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

  
}
