package com.example.SATS.Controller;
import com.example.SATS.Entity.Attendance;
import com.example.SATS.Entity.Student;
import com.example.SATS.Entity.StudentCourse;
import com.example.SATS.Repository.StudentCourseRepository;
import com.example.SATS.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    // for adding the student
    @PostMapping("/addstudent")
    public ResponseEntity<Student> adduser(@RequestBody Student user)
    {
        Student student = studentService.adduser(user);
        return ResponseEntity.ok(student);
    }

    // getting the specific student by studentId
    @GetMapping("/getstudent/{userId}")
    public ResponseEntity<Student> getuser(@PathVariable Integer userId)
    {
        Optional <Student> student = studentService.getuser(userId);
        return student
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    // for fetching all the students for faculty
    @GetMapping("/getall")
    public ResponseEntity<List<Student>> getalluser()
    {
        List <Student> student = studentService.getalluser();
        return ResponseEntity.ok(student);
    }

    // for fetching course bases on the userId
    @GetMapping("/getcourses/{userId}")
    public ResponseEntity<List<StudentCourse>> getcourses(@PathVariable Integer userId)
    {
        return ResponseEntity.ok(studentService.getcourses(userId));
    }

    //for fetching attendacne based on userId
    @GetMapping("/getattendance/{userId}")
    public ResponseEntity<List<Attendance>> getattendance(@PathVariable Integer userId)
    {
         return ResponseEntity.ok(studentService.getattendance(userId));
    }

    // for fetching students based on their courseId
    @GetMapping("/getstudents/{courseId}")
    public ResponseEntity<List<StudentCourse>> getstudents(@PathVariable Integer courseId)
    {
        return ResponseEntity.ok(studentService.getstudents(courseId));
    }




}
