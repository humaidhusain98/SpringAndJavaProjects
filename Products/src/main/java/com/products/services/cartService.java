package com.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.cartItem;


@Service
public class cartService {
	@Autowired
	private com.products.repositories.cartRepo cartRepo;
	
	public List<cartItem> fetchAllCarts() {
		List<cartItem> cartItems = cartRepo.findAll();
		System.out.println("All Carts Fetched Service Class");
		return cartItems;
	}
	
	
	public cartItem fetchCartById(Long id) {
		System.out.println("Product Fetched by id --Service class");
		return cartRepo.findById(id).orElse(null);
	}
	public cartItem fetchCartByProductId(Long id) {
		System.out.println("Cart Fetched  by Product id --Service class");
		return cartRepo.findByCartItemProductsId(id);
	}
	
	
	public void save(cartItem cart) {
		System.out.println("Cart Saved to Repository --Service class");
		cartRepo.save(cart);	
	}
	
	
	public void delete(long id) {
		cartItem obj=cartRepo.findById(id).orElse(null);
		cartRepo.delete(obj);
	}
	
	public void edit(cartItem cart) {
		cartItem obj=cartRepo.findById(cart.getId()).orElse(null);
		obj.setProducts(cart.getProducts());
		obj.setQty(cart.getQty());
		cartRepo.save(obj);
		
	}
	
	
	
	
	
}
