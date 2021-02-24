package com.products.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class wishlist {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	

	public long getId() {
		return id;
	}
	
	private long productid;

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}
	
	
	
	
	

}
