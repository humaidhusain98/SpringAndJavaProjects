package com.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.product;
import com.products.repositories.productRepo;

@Service
public class productService {
	
	@Autowired
	private productRepo productRepo;
	
	public List<product> fetchAllProducts() {
		List<product> products = productRepo.findAll();
		System.out.println("All Products Fetched Service Class");
		return products;
	}
	
	
	public product fetchProductById(Long id) {
		System.out.println("Product Fetched by id --Service class");
		return productRepo.findById(id).orElse(null);
	}
	
	
	public void save(product produc) {
		System.out.println("Product Saved to Repository --Service class");
		productRepo.save(produc);	
	}
	
	
	public void delete(long id) {
		product obj=productRepo.findById(id).orElse(null);
		productRepo.delete(obj);
	}
	
	public void edit(product produc) {
		product obj=productRepo.findById(produc.getId()).orElse(null);
		obj.setName(produc.getName());
		obj.setImageUrl(produc.getImageUrl());
		obj.setPrice(produc.getPrice());
		productRepo.save(obj);
		
	}
	
	public List<product> fetchAllProducts(String keyword) {
		List<product> products = productRepo.findAll(keyword);
		System.out.println("All Products Fetched Service Class");
		return products;
	}


	
	
	
	
	
	
	
}
