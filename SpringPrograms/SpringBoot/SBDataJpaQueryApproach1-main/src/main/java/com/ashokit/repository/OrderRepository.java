package com.ashokit.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ashokit.entity.Order;
import com.ashokit.entity.OrderStatus;

public interface OrderRepository extends CrudRepository<Order, Long> {
	
	
	//retrieves entity objects by customer id
	List<Order>  findByCustomerId(Long customerId);
	
	
	//retrieves entity objects by order status
	List<Order>  findByOrderStatus(OrderStatus orderStatus);
	
	//retrieves entity objects by date greater than the given date
    List<Order>  readByDatePurchasedGreaterThan(LocalDate datePurchased);
	
	
}
