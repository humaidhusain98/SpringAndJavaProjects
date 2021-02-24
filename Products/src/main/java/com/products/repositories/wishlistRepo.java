package com.products.repositories;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.model.wishlist;

public interface wishlistRepo  extends JpaRepository<wishlist, Long>{

	Optional<wishlist> findByproductid(Long productid);
	
	
	
}
