package com.example.SATS.Dtos;

import java.time.LocalDateTime;

public class StudentDtos {
    private String name;
    private String username;
    private String password;
    private String mailId;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public StudentDtos(String name,String username,String password,
    String mailId){
        this.name = name;
        this.username = username;
        this.password = password;
        this.mailId = mailId;
        this.createdAt = null;
        this.updatedAt = null;
    }

    public StudentDtos(){    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
