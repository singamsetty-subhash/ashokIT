package com.ashokit.runner;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.ashokit.entity.Order;
import com.ashokit.entity.OrderStatus;
import com.ashokit.service.OrderService;

@Component
public class MyAppRunner implements ApplicationRunner {
	
	@Autowired
	OrderService orderService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("**+**".repeat(30));
		
		// CALL getOrderById(orderId)
		long orderId = Long.parseLong(args.getOptionValues("orderid").get(0));
		Order order = orderService.getOrderById(orderId);
		System.out.println(order);
		System.out.println("**+**".repeat(30));
		
		// CALL getAllOrders()
		orderService.getAllOrders().forEach(System.out::println);
		System.out.println("**+**".repeat(30));
		
		// CALL getOrdersByCustomerId(customerId)
		long customerId = Long.parseLong(args.getOptionValues("customerid").get(0));
		orderService.getOrdersByCustomerId(customerId).forEach(System.out::println);
		System.out.println("**+**".repeat(30));
		
		// CALL getOrdersByOrderStatus(OrderStatus orderStatus)
		orderService.getOrdersByOrderStatus(OrderStatus.DELIVERED).forEach(System.out::println);
		System.out.println("**+**".repeat(30));
		
		// CALL getOrdersByDateGreaterThanPurchased(LocateDate datePurchased)
		orderService.getOrderByDateGreaterThanPurchased(LocalDate.of(2025, 03, 21)).forEach(System.out::println);
		System.out.println("**+**".repeat(30));

	}

}
