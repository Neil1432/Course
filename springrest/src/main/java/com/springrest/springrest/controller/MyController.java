package com.springrest.springrest.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;


@RestController

public class MyController {
	
	@Autowired
	private CourseService courSerivice;
	

	
	@GetMapping("/courses")
	public List<Course>getcourses()
	{
		
		return this.courSerivice.getCourses();
	}
	
	@GetMapping("/courses/{courseID}")
	
	public Course getCourse(@PathVariable String courseID )
	{
		return this.courSerivice.getCourse(Long.parseLong(courseID));
	}
	}
	


