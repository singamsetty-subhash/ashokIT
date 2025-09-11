package com.subhash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.subhash.entity.Customer;
import com.subhash.repository.CustomerRepository;
@Component
public class MyAppRunner implements ApplicationRunner {
	@Autowired
	CustomerRepository repo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Customer c1=new Customer();
		c1.setName("John");
		c1.setPhoneNumber(9090900L);
		Customer c2=new Customer();
		c2.setName("Miller");
		c2.setPhoneNumber(9090901L);
		c1=repo.save(c1);
		System.out.println("the  Id value customer1 is:"+c1);
		c2=repo.save(c2);
		System.out.println("the  Id value customer2 is:"+c2);
}

}
