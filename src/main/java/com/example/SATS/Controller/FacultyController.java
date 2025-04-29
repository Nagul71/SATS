package com.example.SATS.Controller;
import com.example.SATS.Entity.Faculty;
import com.example.SATS.Service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    @Autowired
    private FacultyService facultyService;
    public ResponseEntity<Faculty> addfaculty(@RequestBody Faculty user)
    {
        Faculty faculty = facultyService.addUser(user);
        return ResponseEntity.ok(faculty);
    }
}
