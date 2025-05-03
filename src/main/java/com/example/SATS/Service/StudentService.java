package com.example.SATS.Service;
import com.example.SATS.Entity.Attendance;
import com.example.SATS.Entity.Course;
import com.example.SATS.Entity.Student;
import com.example.SATS.Entity.StudentCourse;
import com.example.SATS.Repository.AttendanceRepository;
import com.example.SATS.Repository.CourseRepository;
import com.example.SATS.Repository.StudentCourseRepo;
import com.example.SATS.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private StudentCourseRepo studentCourseRepo;

    @Autowired
    private AttendanceRepository attendanceRepository;

    public Student adduser(Student user)
    {
        return studentRepo.save(user);
    }

    public Optional<Student> getuser(Integer userId) {
        return studentRepo.findById(userId);
    }

    public List<Student> getalluser() {
        return studentRepo.findAll();
    }

    public List<StudentCourse> getcourses(Integer userId) {
        return studentCourseRepo.findByStudent_StudentId(userId);
    }


    public List<Attendance> getattendance(Integer userId) {

        return attendanceRepository.findByStudent_StudentId(userId);
    }

    public List<StudentCourse> getstudents(Integer courseId) {
        return studentCourseRepo.findByCourse_CourseId(courseId);
    }
}
