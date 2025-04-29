package com.example.SATS.Service;

import com.example.SATS.Entity.Faculty;
import com.example.SATS.Repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepo;
    public Faculty addUser(Faculty user)
    {
        return facultyRepo.save(user);
    }
}
