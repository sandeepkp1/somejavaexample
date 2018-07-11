package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

@Component
@Entity
public class EmployeeBean {
	
	
	@Id
	@GenericGenerator(name = "id", strategy = "increment")
	@GeneratedValue
	private String id;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	private String empno;
	
	private String name;
	private String desg;
	
	
	public String getEmpno() {
		return empno;
	}
	public void setEmpno(String empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesg() {
		return desg;
	}
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "EmployeeBean [empno=" + empno + ", name=" + name + ", desg=" + desg + "]";
	}
	public EmployeeBean( String id,String empno, String name, String desg) {
		super();
		this.id = id;
		this.empno = empno;
		this.name = name;
		this.desg = desg;
	}
	public EmployeeBean() {
		super();
	}
	

}
