package com.example.SATS.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SATS.Entity.Student;
import com.example.SATS.Repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;
    public Student adduser(Student user)
    {
        return studentRepo.save(user);
    }

}
