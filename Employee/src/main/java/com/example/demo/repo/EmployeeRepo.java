package com.example.demo.repo;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.example.demo.bean.EmployeeBean;


public interface EmployeeRepo extends Repository<EmployeeBean, String>{
	
	public EmployeeBean save(EmployeeBean s1);
	
	
	public void deleteById(String id);
	
	public List<EmployeeBean> findAll();

}
