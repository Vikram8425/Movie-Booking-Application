package com.moving.Boking.Model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Screen{
    @Id
    @Column(name="screenId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "screenType",nullable = false)
    private String type;
    @ManyToOne
   private CinemalF cinema;
    

    
    public CinemalF getCinema() {
		return cinema;
	}

	public void setCinema(CinemalF cinema) {
		this.cinema = cinema;
	}

	public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}
