package com.moving.Boking.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import  com.moving.Boking.Model.User;
@Entity
@Table(name = "Cinema")
public class CinemalF {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "Cinema_Name",nullable = false,length =100)
   private  String name;
    @Column(nullable = false)
    String address;

    @ManyToOne
    private User user;
    
    @OneToMany(mappedBy = "cinema",cascade = CascadeType.ALL)
    private Set<Screen> screen=new HashSet<>();

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	

	public Set<Screen> getScreen() {
		return screen;
	}

	public void setScreen(Set<Screen> screen) {
		this.screen = screen;
	}

	public CinemalF() {

    }

    public CinemalF(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
