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

import com.example.SATS.Dtos.FacultyDtos;
import com.example.SATS.Dtos.FacultyResponseDtos;
import com.example.SATS.Entity.Faculty;
import com.example.SATS.Entity.FacultyCourse;
import com.example.SATS.Service.FacultyService;

@RestController
@RequestMapping("/api/faculty")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;


    

    @PostMapping("/")
    public FacultyResponseDtos addfaculty(@RequestBody FacultyDtos facultyDtos)
    {
        return facultyService.addFaculty(facultyDtos);
    }

    @GetMapping("/getAll")
    public List<Faculty> getAllFaculty() {
        return facultyService.getAllFaculty();
    }

    @GetMapping("/{id}")
    public FacultyResponseDtos getFacultyById(@PathVariable Integer id) {
        return facultyService.getByIdFaculty(id);
    }

    @GetMapping("/courses/{id}")
    public List<FacultyCourse> getCoursesById(@PathVariable Integer id)
    {
        return facultyService.getCourseByFacultyId(id);
    }
    
    @PutMapping("/{id}")
    public FacultyResponseDtos FacultyUpdate(@PathVariable Integer id,@RequestBody FacultyDtos facultyDtos) {
        //TODO: process POST request
        return facultyService.updateFaculty(id,facultyDtos);
    }

    @DeleteMapping("/{id}")
    public String FacultyDelete(@PathVariable Integer id) {
        //TODO: process POST request
        return facultyService.deleteFaculty(id);
    }
}
