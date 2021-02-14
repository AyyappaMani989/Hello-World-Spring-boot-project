package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.ServiceClass;

@RestController
public class ControllerClass {
	
	@GetMapping("/welcome")
	public String printHelloWorld() {
		return ServiceClass.greet();
	}
	
	@GetMapping("/getStudent/{id}")
	public Student getStudentById(@PathVariable("id") int id) {
		return ServiceClass.findStudent(id);
	}
}
