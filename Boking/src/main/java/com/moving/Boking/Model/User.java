package com.moving.Boking.Model;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import com.moving.Boking.Model.CinemalF;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import com.moving.Boking.Model.Moive;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  private   int userId;
    @Column(nullable=false)
  private   String userName;
    @Column(unique=true)
    private String userEmail;
  private   String userAddress;
   private  Date createAt;

   @OneToMany(mappedBy ="user",cascade = CascadeType.ALL)
   private Set<CinemalF> cinema=new HashSet<>();
   
  
   



	public void setCinema(Set<CinemalF> cinema) {
        this.cinema = cinema;
    }

    public Set<CinemalF> getCinema() {
        return cinema;
    }

    public User() {
    }

    public User(int userId, String userName, String userEmail, String userAddress, Date createAt) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userAddress = userAddress;
        this.createAt = createAt;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public Date getCreateAt() {
        return createAt;
    }
}
