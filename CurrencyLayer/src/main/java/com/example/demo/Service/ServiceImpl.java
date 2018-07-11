package com.example.demo.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceImpl implements ServiceInterface{

	RestTemplate restTemplate;
	
	public Object getGoldPrice() {
		System.err.println("Inside");
		restTemplate = new RestTemplate();
		Object obj=restTemplate.getForObject("http://www.apilayer.net/api/live?access_key=0a2e185bbbbab76c1ba2b18e1f5306a4&format=1", Object.class);
		return obj;
	}

}
