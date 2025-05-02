package com.example.SATS.Dtos;

import java.time.LocalDateTime;

public class FacultyResponseDtos {
    private String username;
    private String mailId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public FacultyResponseDtos(String username,String mailId,LocalDateTime createdAt,LocalDateTime updatedAt){
        this.username = username;
        this.mailId = mailId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    };

    public FacultyResponseDtos(){
    };

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
