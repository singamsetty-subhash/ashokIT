package com.pack.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pack.beans.User;

public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		User user=ctx.getBean("user", User.class);
		user.login("admin", "subhash1432@gmail");
	}

}
