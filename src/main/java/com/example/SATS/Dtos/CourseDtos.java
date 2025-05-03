package com.example.SATS.Dtos;

import java.time.LocalDateTime;

import com.example.SATS.Entity.Course;

public class CourseDtos {
    private Integer courseId;
    private String courseName;
    
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public CourseDtos(String courseName){
        this.courseName = courseName;
        this.updatedAt = null;
        this.createdAt = null;
    }

    public CourseDtos(Course course){
        this.courseId = course.getCourseId();
        this.courseName = course.getCourseName();
        this.createdAt = course.getCreatedAt();
        this.updatedAt = course.getUpdatedAt();
    }

    public CourseDtos(){
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
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
