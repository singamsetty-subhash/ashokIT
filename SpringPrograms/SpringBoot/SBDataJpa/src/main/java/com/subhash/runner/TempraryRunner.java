package com.subhash.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.subhash.entity.Order;
import com.subhash.entity.OrderStatus;
import com.subhash.repository.OrderRepository;
@Component
public class TempraryRunner implements ApplicationRunner {
	@Autowired
	OrderRepository repo;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		List<Order> lstOrders=new ArrayList<>();
		lstOrders.add(new Order(19003L,102L,LocalDate.of(2025,03,21),OrderStatus.DELIVERED));
		lstOrders.add(new Order(19004L,103L,LocalDate.of(2025,03,24),OrderStatus.CANCELED));
		lstOrders.add(new Order(19005L,104L,LocalDate.of(2025,03,21),OrderStatus.PROCESSED));
		lstOrders.add(new Order(19007L,102L,LocalDate.of(2025,03,21),OrderStatus.CANCELED));
		lstOrders.add(new Order(19008L,102L,LocalDate.of(2025,03,21),OrderStatus.DELIVERED));
		lstOrders.add(new Order(19009L,103L,LocalDate.of(2025,02,20),OrderStatus.REFUNDED));		
		repo.saveAll(lstOrders);
		
	}

}
