package com.example.SATS.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.SATS.Dtos.CourseDtos;
import com.example.SATS.Entity.Course;
import com.example.SATS.Service.CourseService;



@RestController
@RequestMapping("/api/course")
public class CourseController {
    
    @Autowired
    private CourseService courseService;

    @GetMapping("/")
    public List<Course> getCourseDetails() {
        return courseService.getAllCourse();
    }

    @GetMapping("/{id}")
    public CourseDtos getCourseById(@PathVariable Integer id) {
        return courseService.getCourseById(id);
    }

    @PostMapping("/")
    public CourseDtos postCourse(@RequestBody CourseDtos courseDtos) {
        return courseService.postCourseDetails(courseDtos);
    }
    
    @DeleteMapping("/{id}")
    public String deleteCourse(@PathVariable Integer id){
        return courseService.deleteCoursebyId(id);
    }
}