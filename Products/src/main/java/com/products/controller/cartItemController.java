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
import com.products.model.cartItem;
import com.products.services.cartService;


@RestController
public class cartItemController {
	
	
	@Autowired
	private cartService cartService;
	
	
	@GetMapping("/cart")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<List<cartItem>> getAllCarts() {
		System.out.println("All Carts Displayed --Controller CLass");
		return ResponseEntity.ok().body(cartService.fetchAllCarts());
	}
	
	@GetMapping("/cart/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<cartItem> getProductsById(@PathVariable Long id) {
		System.out.println("Carts Displayed By Id --Controller CLass");
		return ResponseEntity.ok().body(cartService.fetchCartById(id));
	}
	
	/*@GetMapping("/cart/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<cartItem> findCartByProductId(@PathVariable Long id) {
		System.out.println("Fetch Cart  By Product Id if exists --Controller CLass");
		return ResponseEntity.ok().body(cartService.fetchCartByProductId(id));
	}*/
	
	
	
	
	@GetMapping("/cart/search/")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<List<cartItem>> getAllCarts1() {
		System.out.println("All Carts Search Displayed --Controller CLass");
		return ResponseEntity.ok().body(cartService.fetchAllCarts());
	}
	
	
	@PostMapping("/cart")
	@CrossOrigin(origins="http://localhost:4200")
	public cartItem registerCart(@RequestBody cartItem cart){
		
		System.out.println("Cart object saved at repository--Controller CLass");
		cartService.save(cart);
		return cart;
	}
	
	@PutMapping("/cart")
	@CrossOrigin(origins="http://localhost:4200")
	public cartItem editCart(@RequestBody cartItem cart){
		cartService.edit(cart);
		return cart;
	}
	
	@DeleteMapping("/cart/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public cartItem deleteCart(@PathVariable Long id) {
		cartItem obj=cartService.fetchCartById(id);
		cartService.delete(id);
		return obj;
	}
	
	
}
