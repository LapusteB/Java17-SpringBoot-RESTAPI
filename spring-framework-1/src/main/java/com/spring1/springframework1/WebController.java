package com.spring1.springframework1;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@RequestMapping("/Topics")
	public List<Topic> RetrieveAllCourses()
	{
		return Arrays.asList(
				
				new Topic (1, "JVM", "Java Virtual Machine"),
				new Topic (2, "Spring Core", "the core of the framework that power features such as Inversion of Control and dependency injection"),
				new Topic (3, "Application Context", "represents the Spring IoC container that holds all the beans created by the application")
				
				);
	}

}
