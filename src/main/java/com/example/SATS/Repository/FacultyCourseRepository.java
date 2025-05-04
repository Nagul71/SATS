package com.example.SATS.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SATS.Entity.FacultyCourse;

public interface FacultyCourseRepository extends JpaRepository<FacultyCourse, Integer>{

    public List<FacultyCourse> findByFaculty_FacultyId(Integer id);

}
