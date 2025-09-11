package com.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ashokit.bean.HelloBean;

@SpringBootApplication
public class SbHelloApplication {
	static HelloBean hellobean;
	public SbHelloApplication(HelloBean hellobean) {
		super();
		SbHelloApplication.hellobean = hellobean;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SbHelloApplication.class, args);
		hellobean.hello();
	}


}
