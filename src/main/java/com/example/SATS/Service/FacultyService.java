package com.example.SATS.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.SATS.Dtos.FacultyDtos;
import com.example.SATS.Dtos.FacultyResponseDtos;
import com.example.SATS.Entity.Faculty;
import com.example.SATS.Repository.FacultyRepository;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepo;
    public FacultyResponseDtos addFaculty(FacultyDtos Facultydto)
    {
        Faculty facultyEntity = new Faculty(
            Facultydto.getUsername(),
            Facultydto.getPassword(),
            Facultydto.getMailId()
        );
        
        Faculty saved = facultyRepo.save(facultyEntity);

        // return saved;

        return new FacultyResponseDtos(
            saved.getUsername(),
            saved.getMailId(),
            saved.getCreatedAt(),
            saved.getUpdatedAt()
        );
    }

    public List<Faculty> getAllFaculty(){
        return facultyRepo.findAll();
    }

    public FacultyResponseDtos getByIdFaculty(Integer id){
        Optional<Faculty> optionalFaculty = facultyRepo.findById(id);

        if(optionalFaculty.isPresent()){
            Faculty faculty = optionalFaculty.get();
            return new FacultyResponseDtos(
                faculty.getUsername(),
                faculty.getMailId(),
                faculty.getCreatedAt(),
                faculty.getUpdatedAt()
            );
        }
        else{
            throw new RuntimeException("Faculty with the Id"+id+"not found");
        }
    }

    public FacultyResponseDtos updateFaculty(Integer id,FacultyDtos facultyDtos){
        Optional<Faculty> optionalFaculty = facultyRepo.findById(id);

        if(optionalFaculty.isPresent()){
            Faculty faculty = optionalFaculty.get();

            faculty.setUsername(facultyDtos.getUsername());
            faculty.setPassword(facultyDtos.getPassword());
            faculty.setMailId(facultyDtos.getMailId());
            faculty.setUpdatedAt(LocalDateTime.now());

            Faculty Updatedfaculty = facultyRepo.save(faculty); 

            return new FacultyResponseDtos(
                Updatedfaculty.getUsername(),
                Updatedfaculty.getMailId(),
                Updatedfaculty.getCreatedAt(),
                Updatedfaculty.getUpdatedAt()
            );
        }   
        else{
            throw new RuntimeException("Faculty with ID "+id+" not found");
        } 
    }

    public String deleteFaculty(Integer id){
        Optional<Faculty> optionalFaculty = facultyRepo.findById(id);
        if(optionalFaculty.isPresent()){
            Faculty faculty = optionalFaculty.get();
            String username = faculty.getUsername();
            facultyRepo.deleteById(id);
            return "faculty "+username+" deleted Successfully";
        }
        else{
            throw new RuntimeException("Faculty With ID"+id+"not Found.");
        }
    }
}
