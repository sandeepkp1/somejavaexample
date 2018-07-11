package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.ServiceImpl;

@RestController
public class CurrencyLayerController {
	
	@Autowired
	ServiceImpl serviceImpl;
	
	@RequestMapping("/getgoldprice")
	public String getThePrice() {
		Object obj=serviceImpl.getGoldPrice();
		return obj+"";
	}

}
