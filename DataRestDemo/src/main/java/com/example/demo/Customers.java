package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {
	@Id
	private int cid;
	private String cname;
	private String cousename;
	
	
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCousename() {
		return cousename;
	}
	public void setCousename(String cousename) {
		this.cousename = cousename;
	}
	
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", cousename=" + cousename + "]";
	}


}
