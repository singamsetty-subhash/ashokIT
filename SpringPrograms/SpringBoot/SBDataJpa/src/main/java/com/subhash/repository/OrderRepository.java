package com.subhash.repository;

import org.springframework.data.repository.CrudRepository;

import com.subhash.entity.Order;

public interface OrderRepository extends CrudRepository<Order,Long >{
	

}
