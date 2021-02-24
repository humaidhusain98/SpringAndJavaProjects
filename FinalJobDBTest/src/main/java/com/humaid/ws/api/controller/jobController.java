package com.humaid.ws.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.humaid.ws.api.models.Job;
import com.humaid.ws.api.view.JobView;
import com.humaid.ws.api.view.SearchJobView;

@RestController
@RequestMapping("/jobs")
public class jobController {

	//Returns a List of all jobs in the DB
	@GetMapping
	public ResponseEntity<List<Job>>getAllJobs()
	{
		List<Job> joblist=null;
		try 
		{
			joblist=JobView.getAllJobs();
			return ResponseEntity.ok().body(joblist);
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			return ResponseEntity.ok().body(null);
			
		}
	}
	
	
	
	
	
	//Selects the jobs in the DB by id and if not present it returns null
	@GetMapping("/{id}")
	public ResponseEntity<Job> getJobById(@PathVariable int id)
	{
		try 
		{
		return ResponseEntity.ok().body(JobView.getJob(id));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.ok().body(null);
		}
	}
	

	//Post Mapping saves the job object passed as JSON to DB
	@PostMapping
	public ResponseEntity<Integer> saveJobObject(@RequestBody Job job) 
	{
		int resp=-1;
		try 
		{
		resp =	JobView.addJob(job);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resp=-1;
		}
		
		return ResponseEntity.ok().body(resp);
	}
	
	
	//Deletes the job specified by the id
	@GetMapping("/delete")
	public ResponseEntity<Boolean> deleteJobObject(@RequestParam("id") Integer id) 
	{
		boolean resp=false;
		try 
		{
		resp =	JobView.removeJobById(id);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resp=false;
		}
		
		return ResponseEntity.ok().body(resp);
	}
	
	//Edits or Updates the Job Object passed
	@PostMapping("/edit")
	public ResponseEntity<Boolean> editJobObject(@RequestBody Job job ) 
	{
		boolean resp=false;
		try 
		{
		resp =	JobView.updateJob(job);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			resp=false;
		}
		
		return ResponseEntity.ok().body(resp);
	}
	
	//Searches by Competency object in jobcompetencymetric to get all jobs with competency
	@GetMapping("/competencysearch")
	public ResponseEntity<List<Job>> searchJobByCompetency(@RequestParam("searchKey") String searchKey)
	{
		List<Job> joblist=null;
		
		try 
		{
			joblist=SearchJobView.searchJobByCompetency(searchKey);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return ResponseEntity.ok().body(joblist);
	}
	
	
	//searches every string variable in jobs object
	@GetMapping("/jobsearch")
	public ResponseEntity<List<Job>> searchJobEveryString(@RequestParam("keyword") String keyword)
	{
		List<Job> joblist=null;
		try 
		{
			joblist=SearchJobView.searchJobByKeyword(keyword);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return ResponseEntity.ok().body(joblist);
		
	}
	
	
	//Giving -1 means the parameter is not specified
	@GetMapping("/expsearch")
	public ResponseEntity<List<Job>> searchFilterByExp(@RequestParam("minExp") int minExp
		,	@RequestParam("/maxExp") int maxExp)
	{
		List<Job> joblist=null;
		try 
		{
			List<Job> allJobs=JobView.getAllJobs();
			joblist	= SearchJobView.filterByExp(minExp, maxExp, allJobs);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return ResponseEntity.ok().body(joblist);
		
	}
	
	
	
	@GetMapping("/compensationsearch")
	public ResponseEntity<List<Job>> searchFilterByCompensation(@RequestParam("minSal") int minSal
		,	@RequestParam("/maxSal") int maxSal)
	{
		List<Job> joblist=null;
		try 
		{
			List<Job> allJobs=JobView.getAllJobs();
			joblist	= SearchJobView.filterByCompensation(minSal, maxSal, allJobs);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return ResponseEntity.ok().body(joblist);
		
	}
	
	
	
	
	@GetMapping("/ultimatesearch")
	public ResponseEntity<List<Job>> searchUsingUltimateSearch(
		@RequestParam("keyword") String keyword,
		@RequestParam("minExp") int minExp,
		@RequestParam("maxExp") int maxExp,
		@RequestParam("minSal") int minSal,
		@RequestParam("maxSal") int maxSal)
	{
		List<Job> joblist=null;
		
		try 
		{
			joblist=SearchJobView.UltimateSearchAlgorithm(keyword, minExp, maxExp, minSal, maxSal);
			
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		return ResponseEntity.ok().body(joblist);
	}
	
	
	
	
	
	
	
	
	
	
	
}
