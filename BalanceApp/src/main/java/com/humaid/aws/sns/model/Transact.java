package com.humaid.aws.sns.model;

public class Transact {
	@Override
	public String toString() {
		return "Transact [id=" + id + ", amt=" + amt + ", date=" + date + ", description=" + description + "]";
	}
	private int id;
	private int amt;
	private String date;
	private String description;
	private boolean putin;
	
	
	public boolean isPutin() {
		return putin;
	}
	public void setPutin(boolean putin) {
		this.putin = putin;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Transact(int id, int amt, String date, String description,boolean putin) {
		super();
		this.id = id;
		this.amt = amt;
		this.date = date;
		this.description = description;
		this.putin=putin;
	}
	public Transact() {
		super();
	}
	
	
	
	
	
}
