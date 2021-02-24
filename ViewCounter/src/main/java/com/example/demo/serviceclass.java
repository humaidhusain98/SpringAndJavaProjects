package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class serviceclass {
	@Autowired
	private repo viewrep;
	
	public String increaseview(){
		if (viewrep.count()==0)
		{
			views viewobj=new views();
			viewobj.setId(1);
			viewobj.setView(1L);
			viewrep.save(viewobj);
			return "1";
		}
		else {
			views obj=viewrep.findById(1).orElse(null);
			if(obj==null) {
				return "some error";
			}
			else {
				obj.setView((obj.getView()+1));
				viewrep.deleteById(1);
				viewrep.save(obj);
				return (obj.toString());
			}
			
		}
	}
	
}
