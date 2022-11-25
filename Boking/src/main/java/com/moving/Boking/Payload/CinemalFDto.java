package com.moving.Boking.Payload;

import com.moving.Boking.Model.Screen;
import com.moving.Boking.Model.User;

import javax.persistence.*;

public class CinemalFDto {

    private int id;
    private  String name;
    String address;
    private UserDto userDto;
    private ScreenDto screenDto;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setUserDto(UserDto userDto) {
        this.userDto = userDto;
    }

    public void setScreenDto(ScreenDto screenDto) {
        this.screenDto = screenDto;
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

    public UserDto getUserDto() {
        return userDto;
    }

    public ScreenDto getScreenDto() {
        return screenDto;
    }
}
