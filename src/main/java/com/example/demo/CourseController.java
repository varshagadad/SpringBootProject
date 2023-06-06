package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@Autowired
	private CurrencyServiceConfiguration config;
	
	@GetMapping("/display")
	public List<String> getAllCourses(){
		List<String> temp=new ArrayList<>();
		temp.add("Hello");
		temp.add("Hi");
		temp.add("Hiiii");
		return temp;
	}
	
	@GetMapping("/showConfig")
	public CurrencyServiceConfiguration getConfig() {
		return config;
		
	}
	
	@GetMapping("/display1")
	public List<String> getAllCourses1(){
		List<String> temp=new ArrayList<>();
		temp.add("Hello");
		temp.add("Hi");
		temp.add("Hiiii");
		return temp;
	}

}
