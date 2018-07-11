package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.StudentDetails;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	
	@RequestMapping(value="getAllStudents",method = RequestMethod.GET)
	public List<StudentDetails> getAll() {
		return studentService.findAll();
	}
	
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public StudentDetails m2(@RequestBody StudentDetails pc) {
		studentService.save(pc);
		 return pc;
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public String m3(@PathVariable("id") String id) {
		/*System.out.println("id::"+id);
		if(deleteRecord(id) == 0) {
			System.out.println("student not found");
			ret = "Student not found ";
		}
		System.out.println("deleted succ");
		return ret;*/
		deleteRecord(id);
		return "deleted succ";
	}
	
	
		
	public void deleteRecord(String id) {
		//System.out.println("delete record::"+ studentService.deleteStudentById(id));
		
		 studentService.deleteStudentById(id);
	}

}
