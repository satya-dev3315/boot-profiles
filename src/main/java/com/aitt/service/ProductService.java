package com.aitt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aitt.entity.ProductEntity;
import com.aitt.repo.ProductRepo;

import lombok.ToString;

@Service
public class ProductService {

	@Autowired
	private ProductRepo repo;
	
	
	public void saveProducts() {
		ProductEntity productEntity = new ProductEntity();
		productEntity.setProductName("Felony");
		
		ProductEntity save = repo.save(productEntity);
		
	}
}
