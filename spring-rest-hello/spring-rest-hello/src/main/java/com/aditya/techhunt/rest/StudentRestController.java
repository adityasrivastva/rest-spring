package com.aditya.techhunt.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aditya.techhunt.entity.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

	//define endpoint for "/students" - return list of students
	
	
	@GetMapping("/students")
	public List<Student> getStudent(){
		List<Student> students= new ArrayList<>();
		students.add(new Student("Ram", "Shyam"));
		students.add(new Student("Shiva", "Vishnu"));
		students.add(new Student("Brmha", "Mahesh"));
		return students;
	}
	
	
}
