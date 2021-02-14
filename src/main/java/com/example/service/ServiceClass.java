package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@Service
public class ServiceClass {

	@Autowired
	static StudentRepository repo;
	
	public static String greet() {
		return "Hello World";
	}
	
	public static Student findStudent(int id) {
		return repo.findById(id).orElse(null);
	}
}
