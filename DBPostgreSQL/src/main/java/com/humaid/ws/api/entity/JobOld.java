package com.humaid.ws.api.entity;

import java.util.Date;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.List;

public class JobOld 
{
	private Integer id;
	private String title;
	private String date;
	List<String> profession;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return this.date;
	}
	public void setDate(Date date) {
		  SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
		  String strDate= formatter.format(date); 
		  this.date=strDate;
	}
	public List<String> getProfession() {
		return profession;
	}
	public void setProfession(List<String> profession) {
		this.profession = profession;
	}

	public JobOld() {
		super();
	}
	
	
	
	public JobOld(Integer id, String title,List<String> profession) {
		this.id = id;
		this.title = title;
		Date currDate=new Date(); 
		this.profession=profession;
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");  
		String strDate= formatter.format(currDate); 
		this.date=strDate;
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Job [id=" + id + ", title=" + title + ", date=" + date + ", profession=" + profession + "]";
	}
	
	
	
	
	
	
	
	
}
