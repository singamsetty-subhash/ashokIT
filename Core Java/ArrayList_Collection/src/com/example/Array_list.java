package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class Array_list {

	public static void main(String[] args) {
		ArrayList<Employee> employees=new ArrayList<>();
		employees.add(new Employee(7706,"SMITH",5000.0,10));	
		employees.add(new Employee(7132,"MILLER",6000.0,20));	
		employees.add(new Employee(7143,"SOPHIA",4000.0,20));	
		employees.add(new Employee(7522,"SCOTT",6700.0,10));	
		employees.add(new Employee(7488,"JOHN",3000.0,30));	
		employees.add(new Employee(7734,"KING",7000.0,20));	
		employees.add(new Employee(7616,"MIKEL",4000.0,10));	
		ArrayList<Employee> newList=getEmployeesBySal(employees,6000.0);
		System.out.println("list of employees less than 6k");
		for(Employee e:newList) {
			System.out.println(e);
		//	RemoveEmployeeStartsWith("S"),ArrayList<Employee> Employee)
		}

	}

	private static ArrayList<Employee> getEmployeesBySal(ArrayList<Employee> employees, double sal) {
		ArrayList<Employee> newList=new ArrayList<>();
		for(Employee e:employees) {
			if(e.getSal()<sal) {
				newList.add(e);
			}
		}
		return newList;			

	}
	private static void RemoveEmployeeStartsWith(String letter,ArrayList<Employee> employee) {
		Iterator<Employee> itr=employee.iterator();
		while(itr.hasNext()) {
			Employee e=itr.next();
			if(e.getEname().startsWith(letter)) {
				itr.remove();
			}
			
		}
		//display
		for(Employee e:employee) {
			System.out.println(e);
		}
	}
}
//8008618156