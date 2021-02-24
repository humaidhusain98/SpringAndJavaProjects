package com.humaid.ws.api.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Career 
{
	Integer id;
	String industry1;
	String industry2;
	String dateAdded;
	String description;
	String topic;
	String title; 
	int type;//1 for company //2 for competency //3 for Profession //4 for branch //5 for ??
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getIndustry1() {
		return industry1;
	}
	public void setIndustry1(String industry1) {
		this.industry1 = industry1;
	}
	public String getIndustry2() {
		return industry2;
	}
	public void setIndustry2(String industry2) {
		this.industry2 = industry2;
	}
	public String getDateAdded() {
		return dateAdded;
	}
	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Career() {
		super();
		
	}
	public Career(Integer id, String industry1, String industry2, String description, String topic,int type,String title) 
	{
		super();
		this.id = id;
		this.industry1 = industry1;
		this.industry2 = industry2;
		Date currDate=new Date(); 
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
		String currentDate= formatter.format(currDate); 
		this.dateAdded =currentDate;
		
		this.description = description;
		this.topic = topic;
		this.type=type;
		this.title=title;
	}
	@Override
	public String toString() {
		return "Career [id=" + id + ", industry1=" + industry1 + ", industry2=" + industry2 + ", dateAdded=" + dateAdded
				+ ", description=" + description + ", topic=" + topic + ", title=" + title + ", type=" + type + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
