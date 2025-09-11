package com.subhash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subhash.model.Employee;
import com.subhash.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repo;
	public void saveEmployee(Employee e){
		repo.save(e);
		System.out.println("employee is  saved successfully into the data base");
	}
	public void deleteEmployee(int empno) {
		repo.deleteById(empno);
	}
	public void selectById(int empno) {
		repo.findById(empno);
	}
	public void selectAll() {
		repo.find_all();
	}
	public void updateEmployee(int empno,double sal) {
		repo.update(empno, sal);
		System.out.println("Employee is updated successfully");
	}

}
