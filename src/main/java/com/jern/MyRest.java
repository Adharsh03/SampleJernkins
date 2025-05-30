package com.jern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRest {
	
	@GetMapping(value="/hello")
	public String getHello() {
		return "Hello World";
	}
	
	@GetMapping(value="/getMax/{num1}/{num2}")
	public String getMaximum(@PathVariable int num1, @PathVariable int num2) {
		if(num1>num2) {
			return num1+" is maximum";
		}else {
			return num2+" is maximum";
		}
	}
}
