package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TimeZoneDBService {

	public Object getTime() {
		
		RestTemplate restTemplate=new RestTemplate();
		Object obj=restTemplate.getForObject("http://api.timezonedb.com/v2/list-time-zone?key=4DYBVYMALY2V&format=json", Object.class);
		return obj;
	}
	
	
}
