package com.humaid.ws.api.operations;

import java.sql.SQLException;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.people.chat.Model.Career;
import com.people.chat.View.CareerView;

@RestController("/career")
public class CareerController {

	@PostMapping
	public ResponseEntity<Integer> addCareerObj(Career career)
	{
		int resp=-1;
		try 
		{
			resp=CareerView.addCareer(career);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return ResponseEntity.ok().body(resp);
	}
	
	
	@GetMapping
	public ResponseEntity<List<Career>> getAllCareers()
	{
		List<Career> careerlist=null;
		try 
		{
			careerlist=CareerView.getAllCareer();
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		return ResponseEntity.ok().body(careerlist);
	}
	
	
	
	
	
	
	
	
}
