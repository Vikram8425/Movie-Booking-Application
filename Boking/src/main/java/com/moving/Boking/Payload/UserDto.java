package com.moving.Boking.Payload;

import javax.persistence.Column;
import java.util.Date;

public class UserDto {
    private   int userId;
    private   String userName;
    private String userEmail;
    private   String userAddress;
    private Date createAt;

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
