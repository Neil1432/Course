package com.springrest.springrest.entities;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Course {
  @Id
	private long id;
	private String title;
	private String desprition;
	public Course(long id, String title, String desprition) {
		super();
		this.id = id;
		this.title = title;
		this.desprition = desprition;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDesprition() {
		return desprition;
	}
	public void setDesprition(String desprition) {
		this.desprition = desprition;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + ", desprition=" + desprition + "]";
	}  
	
}
