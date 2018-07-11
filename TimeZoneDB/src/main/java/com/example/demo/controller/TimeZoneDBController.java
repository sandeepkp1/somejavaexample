package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.TimeZoneDBService;

@RestController
public class TimeZoneDBController {
	
	@Autowired
	TimeZoneDBService timeZoneDBService;
	
	@RequestMapping("/getTime")
	public Object giveTheTime() {
		return timeZoneDBService.getTime();
	}

}
