package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.products.model.wishlist;
import com.products.services.wishlistService;

@RestController
public class wishlistcontroller {
	
	@Autowired
	private wishlistService wishService;
	
	
	@GetMapping("/wishlist")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<List<wishlist>> getAllWishlist(){
		System.out.println("All Wishlist Displayed --Controller CLass");
		return ResponseEntity.ok().body(wishService.fetchAllWishlists());
	}
	
	@GetMapping("/wishlist/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public ResponseEntity<wishlist> getwishlistById(@PathVariable Long id) {
		System.out.println("Wishlist Displayed By Id --Controller CLass");
		return ResponseEntity.ok().body(wishService.fetchWishlistById(id));
	}
	
	
	
	
	@PostMapping("/wishlist")
	@CrossOrigin(origins="http://localhost:4200")
	public wishlist registerWishlist(@RequestBody wishlist wish){
		
		System.out.println("Wish object saved at repository--Controller CLass");
		wishService.save(wish);
		return wish;
	}
	
	
	
	@DeleteMapping("/wishlist/{id}")
	@CrossOrigin(origins="http://localhost:4200")
	public wishlist deleteCart(@PathVariable long id) {
		wishlist obj=wishService.fetchWishlistById(id);
		wishService.deleteByProductId(id);
		return obj;
	}
	
	
}
