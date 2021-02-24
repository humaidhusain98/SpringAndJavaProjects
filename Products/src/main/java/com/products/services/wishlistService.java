package com.products.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.wishlist;

import com.products.repositories.wishlistRepo;

@Service
public class wishlistService {
	@Autowired
	private wishlistRepo wishlistRepo;
	
	public List<wishlist> fetchAllWishlists() {
		List<wishlist> allwishlist = wishlistRepo.findAll();
		System.out.println("All Wishlist Fetched Service Class");
		return allwishlist;
	}
	
	
	public wishlist fetchWishlistById(Long id)  {
		System.out.println("Wishlist Fetched by id --Service class");
		return wishlistRepo.findById(id).orElse(null) ;
	}
	
	public wishlist fetchWishlistByProductId(Long id)  {
		System.out.println("Wishlist Fetched by Product id --Service class");
		return wishlistRepo.findByproductid(id).orElse(null) ;
	}
	
	
	public void save(wishlist wishli) {
		System.out.println("Wishlist Saved to Repository --Service class");
		wishlistRepo.save(wishli);	
	}
	
	
	public void delete(long id) {
		wishlist obj=wishlistRepo.findById(id).orElse(null);
		wishlistRepo.delete(obj);
	}
	
	public void deleteByProductId(long id) {
		wishlist obj=wishlistRepo.findByproductid(id).orElse(null);
		wishlistRepo.delete(obj);
	}
	
	public void edit(wishlist wish) {
		wishlist obj=wishlistRepo.findById(wish.getId()).orElse(null);
		obj.setProductid(wish.getProductid());
		wishlistRepo.save(obj);
		
	}
	


	
	
	
	
	
}
