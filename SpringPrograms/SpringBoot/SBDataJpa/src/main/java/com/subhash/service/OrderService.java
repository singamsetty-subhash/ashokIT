package com.subhash.service;

import com.subhash.entity.Order;

public interface OrderService {
	Order saveOrUpdate(Order order);
	Order getOrder(Long order);
	Iterable<Order> getAllOrders();
	void deleteOrder(Long orderId);
}
