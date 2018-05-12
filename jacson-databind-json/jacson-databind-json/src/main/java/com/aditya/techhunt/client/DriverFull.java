package com.aditya.techhunt.client;

import java.io.File;

import com.aditya.techhunt.vo.Address;
import com.aditya.techhunt.vo.Student;
import com.fasterxml.jackson.databind.ObjectMapper;

public class DriverFull {

	public static void main(String[] args) {
		try {
			// create object mapper
			ObjectMapper mapper = new ObjectMapper();

			// read JSON file and map/converted to Java POJO : data/sample-lite.json
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);

			// print first name and last name
			System.out.println("First Name=" + theStudent.getFirstName());
			System.out.println("Last Name=" + theStudent.getLastName());
			
			//print out address: Street and City
			
			Address tempAddress = theStudent.getAddress();
			
			System.out.println("Street="+ tempAddress.getStreet());
			System.out.println("State="+ tempAddress.getState());
			
			//print out languages
			for (String tempLang : theStudent.getLanguages()) {
				System.out.println(tempLang);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException:
	 * Unrecognized field "address" (class com.aditya.techhunt.vo.Student), not
	 * marked as ignorable (4 known properties: "lastName", "id", "active",
	 * "firstName"])
	 */

	/*
	 * com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException:
	 * Unrecognized field "languages" (class com.aditya.techhunt.vo.Student), not
	 * marked as ignorable (5 known properties: "lastName", "id", "address",
	 * "active", "firstName"])
	 */
	
	/*
	 * com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException:
	 * Unrecognized field "company" (class com.aditya.techhunt.vo.Student), not
	 * marked as ignorable (6 known properties: "lastName", "address", "active",
	 * "id", "firstName", "languages"])
	 */
	
	

}
