package com.restfull.first_rest.controllers;

import com.restfull.first_rest.dtos.OrderDto;
import com.restfull.first_rest.dtos.StudentDto;
import com.restfull.first_rest.entities.Student;
import com.restfull.first_rest.services.MainService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    private final MainService mainService;


    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/v1/hello")
    public String sayHello() {
        return "Hello world!!!";
    }

    @PostMapping("/v1/request-message")
    public String printMessage(@RequestBody String mssg) {
        return "Received your message: " + mssg;
    }

    @PostMapping("/v1/create-order")
    public String createOrder(@RequestBody OrderDto order) {
        return order.toString();
    }

    @GetMapping("/v1/greeting")
    public String greeting(@RequestParam("first-name") String firstName, @RequestParam("last-name") String lastName) {
        return "Hello, " + firstName + " " + lastName + " nice to meet you!";
    }

    @PostMapping("/v1/save-student")
    public StudentDto saveStudent(@RequestBody Student studentDto) {
        return mainService.saveStudent(studentDto);
    }

    @GetMapping("/v1/get-all-students")
    public List<Student> getAllStudents() {
        return mainService.getAllStudents();
    }

    @GetMapping("/v1/get-student-by-name/{student-name}")
    public List<Student> findAllUserByFirstName(@PathVariable("student-name") String studentName) {
        return  mainService.getAllStudentByFirstName(studentName);
    }

    @GetMapping("/v1/get-student")
    public StudentDto findAStudent(@RequestParam("email") String email) {
        return mainService.findAStudent(email);
    }
}
