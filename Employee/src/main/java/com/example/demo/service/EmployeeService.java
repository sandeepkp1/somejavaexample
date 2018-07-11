package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.EmployeeBean;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepo EmployeeRepo;

	public void save(EmployeeBean pc) {
		EmployeeRepo.save(pc);
		
	}
	
	public List<EmployeeBean> findAll() {
		return EmployeeRepo.findAll();
	}

	public void deleteEmployeeById(String id) {
		 EmployeeRepo.deleteById(id);
	}

}
