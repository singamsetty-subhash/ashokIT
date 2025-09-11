package com.subhash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
 @GetMapping(value="/Hello")
 public String sayHello() {
	 System.out.println("inside say Hello()");
	return "Hello";
	 
 }
}
