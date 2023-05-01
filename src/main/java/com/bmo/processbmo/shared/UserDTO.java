package com.bmo.processbmo.shared;

import java.util.Date;

public class UserDTO {
    
    private Integer userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private Date userDateBirth;

    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public Date getUserDateBirth() {
        return userDateBirth;
    }
    public void setUserDateBirth(Date userDateBirth) {
        this.userDateBirth = userDateBirth;
    }
}
