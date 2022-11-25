package com.moving.Boking.Payload;

import com.moving.Boking.Model.CinemalF;
import com.moving.Boking.Model.Moive;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

public class ScreenDto {
    private int id;
    private String type;
   

    

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

 

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    
}
