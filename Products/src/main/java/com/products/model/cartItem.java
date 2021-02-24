package com.products.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class cartItem {
	@Id
	long id;
	
	@OneToOne
	product products;
	 
	int qty=1;

	public product getProducts() {
		return products;
	}

	public void setProducts(product products) {
		this.products = products;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public long getId() {
		return id;
	}
	
    
    
    
	
		
}
