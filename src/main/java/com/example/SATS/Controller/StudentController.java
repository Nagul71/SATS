package com.example.SATS.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SATS.Dtos.StudentDtos;
import com.example.SATS.Dtos.StudentResponseDtos;
import com.example.SATS.Entity.Student;
import com.example.SATS.Entity.StudentCourse;
import com.example.SATS.Service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/students/{id}")
    public List<StudentCourse> getAllCoursesWithStudentId(@PathVariable Integer id) {
        return studentService.getAllCourseStudentId(id);
    }
    
    @GetMapping("/")
    public List<Student> getStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentResponseDtos getStudentbyId(@PathVariable Integer id) {
        return studentService.getStudentDetail(id);
    }

    @PostMapping("/")
    public StudentResponseDtos postNewStudent(@RequestBody StudentDtos studentDtos) {
        return studentService.addNewStudent(studentDtos);
    }
    
    @PutMapping("/{id}")
    public StudentResponseDtos updateStudentDetail(@PathVariable Integer id, @RequestBody StudentDtos studentDtos) {
        return studentService.updateStudentDetail(id,studentDtos);
    }

    @DeleteMapping("/{id}")
    public String deleteStudentDetail(@PathVariable Integer id){
        return studentService.deleteStudentDetail(id);
    }
}
