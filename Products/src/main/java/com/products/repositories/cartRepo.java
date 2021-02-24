package com.products.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.products.model.cartItem;

@Repository
public interface cartRepo extends JpaRepository<cartItem, Long> {
	@Query("SELECT p FROM cartItem p WHERE p.products.id LIKE %?1%")
	public cartItem findByCartItemProductsId(Long id);
	
}
