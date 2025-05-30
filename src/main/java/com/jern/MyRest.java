package com.jern;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRest {
	
	@GetMapping(value="/hello")
	public String getHello() {
		return "Hello World";
	}
}
