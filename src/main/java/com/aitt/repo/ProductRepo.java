package com.aitt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aitt.entity.ProductEntity;

public interface ProductRepo extends JpaRepository<ProductEntity, Integer> {

}
