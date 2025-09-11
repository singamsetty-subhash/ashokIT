package com.subhash.repository;

import org.springframework.data.repository.CrudRepository;

import com.subhash.entity.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
