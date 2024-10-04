package com.restfull.first_rest.repositories;

import com.restfull.first_rest.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllByFirstNameContaining(String param);
}
