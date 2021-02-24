package com.products.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.products.model.product;

@Repository
public interface productRepo extends JpaRepository<product, Long>{

	Optional<product> findByName(String name);

	@Query("SELECT p FROM product p WHERE p.name LIKE %?1%"+"OR p.price LIKE %?1%")
	public List<product> findAll(String keyword);
	
	
	
	
}
