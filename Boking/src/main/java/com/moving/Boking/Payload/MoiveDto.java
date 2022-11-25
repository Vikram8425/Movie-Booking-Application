package com.moving.Boking.Payload;

import java.util.Date;
import java.util.List;

import com.moving.Boking.Model.User;

public class MoiveDto {
	
	private ScreenDto screen;
	
	private	UserDto user;
	
	 private String title;
	  private Date releaseDate; 
	  private int id;  
	    
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public UserDto getUser() {
		return user;
	}
	public void setUser(UserDto user) {
		this.user = user;
	}
	public ScreenDto getScreen() {
		return screen;
	}
	public void setScreen(ScreenDto screen) {
		this.screen = screen;
	}
	
	
	

}
