package com.example.SATS.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SATS.Entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty,Integer> {
}
