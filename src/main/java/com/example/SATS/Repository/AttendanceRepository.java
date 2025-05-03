package com.example.SATS.Repository;

import com.example.SATS.Entity.Attendance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AttendanceRepository extends JpaRepository<Attendance,Integer> {
    List<Attendance> findByStudent_StudentId(Integer userId);
}
