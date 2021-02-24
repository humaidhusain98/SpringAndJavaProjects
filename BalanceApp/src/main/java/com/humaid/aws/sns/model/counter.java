package com.humaid.aws.sns.model;

public class counter {

	@Override
	public String toString() {
		return "counter [id=" + id + ", count=" + count + "]";
	}
	private int id;
	private int count;
	public counter(int id, int count) {
		this.id = id;
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
