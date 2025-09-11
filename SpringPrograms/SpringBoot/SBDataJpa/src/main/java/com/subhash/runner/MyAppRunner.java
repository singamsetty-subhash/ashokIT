package com.subhash.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.subhash.entity.Order;
import com.subhash.entity.OrderStatus;
import com.subhash.service.OrderService;
//@Component
class MyAppRunner implements ApplicationRunner {

	@Autowired
	OrderService orderService;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Order order=new Order(19002L,102L,LocalDate.of(2025,03,25),OrderStatus.PROCESSED);
		orderService.saveOrUpdate(order);
		System.out.println(order);
		System.out.println("Order Saved Successfully!");
		System.out.println("---------------------------------");
		/*Order o=orderService.getOrder(19001L);
		System.out.println(o);*/
		Iterable<Order> iterable=orderService.getAllOrders();
		iterable.forEach(ord -> System.out.println(ord));
	
	}

}
