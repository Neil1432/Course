package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.Coursedao;
import com.springrest.springrest.entities.Course;
@Service
public class CourseServiceimpl implements CourseService {
	
	@Autowired
	private Coursedao courseDao;
	
	
	//List<Course> list;
	
	public CourseServiceimpl() {
		
		//list=new ArrayList<>();
		//list.add(new Course(12,"java","Basics of JAVA"));
		
	}
	
	
	
	
	

	@Override
	public List<Course> getCourses() {

		return courseDao.findAll();
	}






	@Override
	public Course getCourse(long courseID) {
		
		//Course c=null;
		//for(Course course:list) {
		//	if (course.getId()==courseID) {
		//		c=course;
		//	}
		//}
		return courseDao.getOne(courseID);
	}

}
