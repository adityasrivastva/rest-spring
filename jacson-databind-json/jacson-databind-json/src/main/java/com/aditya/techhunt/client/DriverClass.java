package com.aditya.techhunt.client;

import java.io.File;

import com.aditya.techhunt.vo.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DriverClass {
	public static void main(String[] args) {
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();

			// read JSON file and map/converted to Java POJO : data/sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-lite.json"), Student.class);

			// print first name and last name
			System.out.println("First Name=" + theStudent.getFirstName());
			System.out.println("Last Name=" + theStudent.getLastName());

			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
