package com.ecoomerce.sportscenter.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecoomerce.sportscenter.entity.Basket;

@Repository
public interface BasketRepository extends CrudRepository<Basket, String> {
}
