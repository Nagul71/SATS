package com.example.SATS.Controller;


import com.example.SATS.Entity.Student;
import com.example.SATS.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @PostMapping("/addstudent")
    public ResponseEntity<Student> adduser(@RequestBody Student user)
    {
        Student student = studentService.adduser(user);
        return ResponseEntity.ok(student);
    }
}
