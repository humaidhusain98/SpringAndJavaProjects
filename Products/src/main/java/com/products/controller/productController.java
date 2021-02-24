package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.products.model.product;
import com.products.services.productService;

@RestController
public class productController {
	@Autowired
	private productService service;
	
	
	@GetMapping("/products")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<List<product>> getAllProducts() {
		System.out.println("All Products Displayed --Controller CLass");
		return ResponseEntity.ok().body(service.fetchAllProducts());
	}
	
	@GetMapping("/products/$id")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<product> getProductsById(@PathVariable Long id)  {
		System.out.println("Products Displayed By Id --Controller CLass");
		return ResponseEntity.ok().body(service.fetchProductById(id));
	}
	
	@GetMapping("/products/search/{searchkey}")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<List<product>> search(@PathVariable String searchkey)  {
		System.out.println("SEARCH FUNCTIONALITY BEING IMPLEMENTED --Controller CLass");
		return ResponseEntity.ok().body(service.fetchAllProducts((searchkey)));
	}
	
	@GetMapping("/products/search/")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<List<product>> getAllMedicalCenters1()  {
		System.out.println("All MedicalCenters Displayed --Controller CLass");
		return ResponseEntity.ok().body(service.fetchAllProducts());
	}
	
	
	@PostMapping("/products")
	@CrossOrigin(origins="http://localhost:4200")
	public product registerProduct(@RequestBody product produc){
		
		System.out.println("Product object saved at repository--Controller CLass");
		service.save(produc);
		return produc;
	}
	
	@PutMapping("/products")
	@CrossOrigin(origins="http://localhost:4200")
	public String editProduct(@RequestBody product produc){
		service.edit(produc);
		return "Product Center Object Updated Successfully Saved";
	}
	
	@DeleteMapping("/products")
	@CrossOrigin(origins="http://localhost:4200")
	public String deleteProduct(@RequestBody long id) {
		service.delete(id);
		return "Product Object deleted";
	}
	
	
	
	
	
	
	
	
}
