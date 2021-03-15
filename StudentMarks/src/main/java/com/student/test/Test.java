package com.student.test;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.student.Student;

public class Test {

	public static void main(String[] args) throws IOException {
		//String json= "{\"sid\":10,\"sname\":\"ganesh\",\"sfee\":\"200\"}";
		//String json="E:/logs/student.json";
		ObjectMapper om=new ObjectMapper();
		Student std=om.readValue(new File("E:/logs/student.json"), Student.class);
		System.out.println(std);

	}

}
