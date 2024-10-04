package com.restfull.first_rest.services;


import com.restfull.first_rest.entities.Student;
import com.restfull.first_rest.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    private final StudentRepository studentRepository;

    public MainService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public List<Student> getAllStudentByFirstName(String firstName) {
        return studentRepository.findAllByFirstNameContaining(firstName);
    }
}
