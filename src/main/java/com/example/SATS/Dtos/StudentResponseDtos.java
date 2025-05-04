package com.example.SATS.Dtos;

import java.time.LocalDateTime;

public class StudentResponseDtos {
    private String name;
    private String userName;
    private String mailId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public StudentResponseDtos(String name,String userName,String mailId,
    LocalDateTime createdAt,LocalDateTime updatedAt){
        this.name = name;
        this.userName = userName;
        this.mailId = mailId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public StudentResponseDtos(){
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
