package com.restfull.first_rest.services;


import com.restfull.first_rest.dtos.StudentDto;
import com.restfull.first_rest.entities.Student;
import com.restfull.first_rest.repositories.StudentRepository;
import com.restfull.first_rest.utils.Helper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    private final StudentRepository studentRepository;

    public MainService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public StudentDto saveStudent(Student student) {
        var st = studentRepository.save(student);
        return Helper.toStudentDto(st);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> getAllStudentByFirstName(String firstName) {
        return studentRepository.findAllByFirstNameContaining(firstName);
    }

    public StudentDto findAStudent(String email) {
        Student savedRecord = studentRepository.findByEmail(email);
        return Helper.toStudentDto(savedRecord);
    }
}
