package com.moving.Boking.Model;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Moive{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="movieId")
    private int id;
    @Column(name="movieTitle",nullable = false,length = 100)
    private String title;
    private Date releaseDate;
    @OneToOne
    private Screen screen;
    @ManyToOne
    private User user;
    

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Screen getScreen() {
        return screen;
    }

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
