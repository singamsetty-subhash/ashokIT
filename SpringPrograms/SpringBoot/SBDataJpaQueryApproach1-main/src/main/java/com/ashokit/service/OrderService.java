package com.ashokit.service;

import java.time.LocalDate;
import java.util.List;

import com.ashokit.entity.Order;
import com.ashokit.entity.OrderStatus;

public interface OrderService {
	
	 Order getOrderById(Long orderId);
	 
	 Iterable<Order> getAllOrders();
	 
	 List<Order> getOrdersByCustomerId(Long customerId);
	 
	 List<Order> getOrdersByOrderStatus(OrderStatus orderStatus);
	 
	 List<Order> getOrderByDateGreaterThanPurchased(LocalDate datePurchased);
	 
	 
	 
}
