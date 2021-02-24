package com.humaid.aws.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class User {
	
	@Id
	private String mobile;
	private int otp;
	private Date date;
	private String name;
	private String token;
	
	
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getOtp() {
		return otp;
	}
	public void setOtp(int otp) {
		this.otp = otp;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
	
	

}
