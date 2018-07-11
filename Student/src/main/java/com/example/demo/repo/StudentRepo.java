package com.example.demo.repo;

import java.util.List;

//import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import com.example.demo.bean.StudentDetails;

//@NoRepositoryBean

public interface StudentRepo extends Repository<StudentDetails, String>{
	
	public StudentDetails save(StudentDetails s1);
	
	
	
	public void deleteById(String i1);
	
	public List<StudentDetails> findAll();
}
