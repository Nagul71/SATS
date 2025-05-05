package com.example.SATS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SATS.Entity.StudentCourse;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, Integer> {
    public List<StudentCourse> findBystudent_studentId(Integer id);
}
