package com.humaid.aws.sns.model;

public class balance {

	@Override
	public String toString() {
		return "balance [id=" + id + ", bal=" + bal + "]";
	}
	private int id;
	private int bal;
	public balance(int id, int bal) {
		this.id = id;
		this.bal = bal;
	}
	public int getBal() {
		return bal;
	}
	public void setBal(int bal) {
		this.bal = bal;
	}
	
	
}
