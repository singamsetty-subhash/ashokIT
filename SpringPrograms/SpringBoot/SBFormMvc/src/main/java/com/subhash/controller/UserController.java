package com.subhash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.subhash.model.User;

@Controller
public class UserController {
	
	@GetMapping(value="/form")
	public String getFormOage(Model model) {
		User user=new User();//form object
		model.addAttribute("user",user);
		return "User";//logical view name
	}
	@PostMapping(value="/register")
	public String handleForm(@ModelAttribute("user")User user,Model model) {
		System.out.println(user);
		model.addAttribute("username",user.getUsername());
		model.addAttribute("email",user.getEmail());
		model.addAttribute("mobile",user.getMobile());
		model.addAttribute("gender",user.getGender());
		return "UserDetails";
	}
}
