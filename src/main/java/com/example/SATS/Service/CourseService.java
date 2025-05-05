package com.example.SATS.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SATS.Dtos.CourseDtos;
import com.example.SATS.Entity.Course;
import com.example.SATS.Repository.CourseRepository;

@Service
public class CourseService {
    
    @Autowired 
    CourseRepository courseRepo;
    
    public List<Course> getAllCourse(){
        return courseRepo.findAll();
    }

    public CourseDtos getCourseById(Integer id){
        Optional<Course> optionalCourse = courseRepo.findById(id);
        
        if(optionalCourse.isPresent()){
            Course course = optionalCourse.get();
            return new CourseDtos(course);
        }
        else{
            throw new RuntimeException("Course with ID"+id+"not Found");
        }
    }

    public CourseDtos postCourseDetails(CourseDtos courseDtos){
        Course courseEntity = new Course(
            courseDtos.getCourseName()
        );

        Course saved = courseRepo.save(courseEntity);

        return new CourseDtos(saved);
    }

    public String deleteCoursebyId(Integer id){
        Optional<Course> optionalCourse = courseRepo.findById(id);
        
        if(optionalCourse.isPresent()){
            Course course = optionalCourse.get();
            String CourseName = course.getCourseName();
            courseRepo.deleteById(id);
            return "course "+CourseName+" deleted Sucessfully";
        }else{
            throw new RuntimeException("Faculty with ID: "+id+"not Found.");
        }
    }
}
