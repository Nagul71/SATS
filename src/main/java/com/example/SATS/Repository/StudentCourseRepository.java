package com.example.SATS.Repository;
import com.example.SATS.Entity.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse,Integer> {
    List<StudentCourse> findByStudent_StudentId(Integer studentId);

    List<StudentCourse> findByCourse_CourseId(Integer courseId);

}
