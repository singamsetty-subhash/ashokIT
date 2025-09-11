package com.ecoomerce.sportscenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecoomerce.sportscenter.entity.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
