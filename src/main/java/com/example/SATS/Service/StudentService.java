package com.example.SATS.Service;
import com.example.SATS.Entity.Attendance;
import com.example.SATS.Entity.Student;
import com.example.SATS.Entity.StudentCourse;
import com.example.SATS.Repository.AttendanceRepository;
import com.example.SATS.Repository.StudentCourseRepository;
import com.example.SATS.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentCourseRepository studentCourseRepo;

    @Autowired
    private StudentRepository studentRepo;

    @Autowired
    private StudentCourseRepository studentCourseRepository;

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
        return studentCourseRepository.findByStudent_StudentId(userId);
    }


    public List<Attendance> getattendance(Integer userId) {

        return attendanceRepository.findByStudent_StudentId(userId);
    }

    public List<StudentCourse> getstudents(Integer courseId) {
        return studentCourseRepo.findByCourse_CourseId(courseId);
    }
}
