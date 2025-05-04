package com.example.SATS.Service;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import com.example.SATS.Dtos.StudentDtos;
import com.example.SATS.Dtos.StudentResponseDtos;
import com.example.SATS.Entity.Student;
import com.example.SATS.Repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    public List<Student> getAllStudents(){
        return studentRepo.findAll();
    }

    public StudentResponseDtos addNewStudent(StudentDtos studentDtos){
        Student newStudent = new Student(
            studentDtos.getName(),
            studentDtos.getUsername(),
            studentDtos.getMailId(),
            studentDtos.getPassword()
        );

        Student saved = studentRepo.save(newStudent);

        return new StudentResponseDtos(
            saved.getName(),
            saved.getUsername(),
            saved.getMailId(),
            saved.getCreatedAt(),
            saved.getUpdatedAt()
        );

    };

    public StudentResponseDtos getStudentDetail(Integer id){
        Optional<Student> optionalStudent = studentRepo.findById(id);
        
        if(optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            return new StudentResponseDtos(
                student.getName(),
                student.getUsername(),
                student.getMailId(),
                student.getCreatedAt(),
                student.getUpdatedAt()
            );
        }
        else{
            throw new RuntimeException("Student with the Id "+id+" not found");
        }
    }

    public StudentResponseDtos updateStudentDetail(Integer id,StudentDtos studentDtos){
        Optional<Student> optionalStudent = studentRepo.findById(id);
        if(optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            
            student.setName(studentDtos.getName());
            student.setUsername(studentDtos.getUsername());
            student.setMailId(studentDtos.getMailId());
            student.setPassword(studentDtos.getPassword());
            student.setUpdatedAt(LocalDateTime.now());

            Student updatedStudent = studentRepo.save(student);

            return new StudentResponseDtos(
                updatedStudent.getUsername(),
                updatedStudent.getName(),
                updatedStudent.getMailId(),
                updatedStudent.getCreatedAt(),
                updatedStudent.getUpdatedAt()
            );
        }
        else{
            throw new RuntimeException("Student with the id "+id+" not found");
        }
    }

    public String deleteStudentDetail(Integer id){
        Optional<Student> optionalStudent = studentRepo.findById(id);

        if(optionalStudent.isPresent()){
            Student student = optionalStudent.get();
            String name = student.getName();
            studentRepo.deleteById(id);
            return "student "+name+" deleted sucessfully";
        }
        else{
            throw new RuntimeException("Student with the id "+ id + " not found");
        }
    }
}
