package com.subhash.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subhash.entity.Order;
import com.subhash.repository.OrderRepository;
@Service("orderService")

public class OrderServiceImpl implements OrderService {

	 @Autowired
	OrderRepository repository;
	@Override
	public Order saveOrUpdate(Order order) {
		return repository.save(order);
	}

	@Override
	public Order getOrder(Long orderId) {
		Optional<Order>opt =repository.findById(orderId);
		 	if(opt.isPresent())
		 		return opt.get();
	 	 	return null;
	}

	@Override
	public Iterable<Order> getAllOrders() {
		return repository.findAll();
	}

	@Override
	public void deleteOrder(Long orderId) {
		repository.deleteById(orderId);
	}


	}


