package com.example.MyApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class MyAppController {
	@GetMapping("/msg")
	
	public String myMessage() {
		return "Hello!!!";
	}
	
    @GetMapping("/name")
     public String myName() {
	 return "My name is Kaweesha. \n My age is 24."; 
}
}
