package com.example.Hello.World;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.model.Student;
import com.example.repository.StudentRepository;

@SpringBootApplication
@ComponentScan("com.example.controller")
public class HelloWorldApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
