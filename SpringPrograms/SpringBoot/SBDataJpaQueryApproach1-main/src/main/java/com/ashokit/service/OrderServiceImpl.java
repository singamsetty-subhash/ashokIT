package com.ashokit.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Order;
import com.ashokit.entity.OrderStatus;
import com.ashokit.repository.OrderRepository;

@Service( "orderService" )
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	OrderRepository repository;
	
	@Override
	public Order getOrderById(Long orderId) {
		// TODO Auto-generated method stub
		return repository.findById(orderId).get();
	}
	
	@Override
	public Iterable<Order> getAllOrders() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
	@Override
	public List<Order> getOrdersByCustomerId(Long customerId) {
		// TODO Auto-generated method stub
		return repository.findByCustomerId(102L);
	}
	
	@Override
	public List<Order> getOrdersByOrderStatus(OrderStatus orderStatus) {
		// TODO Auto-generated method stub
		return repository.findByOrderStatus(OrderStatus.DELIVERED);
	}
	
	@Override
	public List<Order> getOrderByDateGreaterThanPurchased(LocalDate datePurchased) {
		// TODO Auto-generated method stub
		return repository.readByDatePurchasedGreaterThan(LocalDate.of(2025, 03, 21));
	}
	
	
}






