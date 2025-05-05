package com.example.SATS.Dtos;

import java.time.LocalDateTime;

public class FacultyDtos {
    private String username;
    private String password;
    private String mailId;

    private LocalDateTime updatedAt;
    private LocalDateTime createdAt;

    public FacultyDtos(String username,String password,String mailId){
        this.username = username;
        this.password = password;
        this.mailId = mailId;
        this.updatedAt = null;
        this.createdAt = null;
    }

    public FacultyDtos(){
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMailId() {
        return mailId;
    }

    public void setMailId(String mailId) {
        this.mailId = mailId;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
