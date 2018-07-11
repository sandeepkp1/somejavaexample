package com.example.demo.bean;

import javax.persistence.*;

import org.springframework.stereotype.Component;


@Component
@Entity
public class StudentDetails {
	@Id
	private String id;
	private String name;
	private String dept;
	
	

	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDetails(String id, String name, String dept) {
		
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", dept=" + dept + "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	

}
