package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class views {
	@Id
	private int id;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public views(int id, Long view) {
		super();
		this.id = id;
		this.view = view;
	}

	public views() {
		super();
	}

	private Long view;

	public Long getView() {
		return view;
	}

	@Override
	public String toString() {
		return ""+view;
	}

	public void setView(Long view) {
		this.view = view;
	}
	
	
}
