package com.subhash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
 @GetMapping(value="/Hello")

 public String sayHello(@RequestParam String username,Model model) {
	 System.out.println("inside say Hello()");
	 model.addAttribute("user", username);
	return "Hello";
	 
 }
}
