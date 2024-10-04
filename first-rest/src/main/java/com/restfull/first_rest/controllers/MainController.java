package com.restfull.first_rest.controllers;

import com.restfull.first_rest.dtos.OrderDto;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

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
}
