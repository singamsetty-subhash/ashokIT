package com.subhash.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.subhash.model.Employee;
import com.subhash.service.EmployeeService;
@Component
@Order(2)
public class ServiceCaller implements ApplicationRunner {
	@Autowired
	EmployeeService s;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Employee e=new Employee(7060,"david",7000,30);
		s.saveEmployee(e);
		System.out.println("*+*".repeat(20));
		s.updateEmployee(7788, 6999.0);
		System.out.println("*+*".repeat(20));
		s.deleteEmployee(7186);
		System.out.println("*+*".repeat(20));
		s.selectById(7785);
		System.out.println("*+*".repeat(20));
		s.selectAll();
		System.out.println("*+*".repeat(20));
	}

}
