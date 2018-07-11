package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.StudentDetails;
import com.example.demo.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo studentRepo;

	public void save(StudentDetails pc) {
		studentRepo.save(pc);
		
	}
	
	public List<StudentDetails> findAll() {
		return studentRepo.findAll();
	}

	public void deleteStudentById(String id) {
		 studentRepo.deleteById(id);
	}

}
