package com.example.SATS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SATS.Entity.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}
