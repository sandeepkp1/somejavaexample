package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.EmployeeBean;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService EmployeeService;
	
	
	@RequestMapping(value="getAllEmployee",method = RequestMethod.GET)
	public List<EmployeeBean> getAll() {
		return EmployeeService.findAll();
	}
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public EmployeeBean m2(@RequestBody EmployeeBean pc) {
		EmployeeService.save(pc);
		 return pc;
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public String m3(@PathVariable("id") String id) {
		deleteRecord(id);
		return "deleted succ";
	}
	
	
		
	public void deleteRecord(String id) {
		//System.out.println("delete record::"+ EmployeeService.deleteStudentById(id));
		
		 EmployeeService.deleteEmployeeById(id);
	}

}
