package com.humaid.ws.api.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.humaid.ws.api.models.applyJob;
import com.humaid.ws.api.utils.credentials;
import com.humaid.ws.api.view.ApplyJobView;


@RestController
@RequestMapping("/applyjobs")
public class applyJobController 
{
	//Used by User to get All Job Applications he/she has applied to by giving userid
	@GetMapping("/user/getallapplications/{userid}")
	public ResponseEntity<List<applyJob>> getAllUserAppliedJobs(@PathVariable int userid)
	{
		try 
		{
		return ResponseEntity.ok().body(ApplyJobView.getAllMyapplication(userid));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.ok().body(null);
		}
	}
	
	//Used To Check if user has applied to specific Job giving userid and jobid
	@GetMapping("/user/isApplied")
	public ResponseEntity<Boolean> isAppliedToJob(@RequestParam("userId")int userId,
			@RequestParam("jobId") int jobId)
	{
		boolean resp=ApplyJobView.isApplied(userId, jobId);
		return ResponseEntity.ok().body(resp);
		
	}
	
	//Used By user To apply to a particular job adding applyJob object having all details
	//Note it checks if CV of user is uploaded to AWS if not uploaded then it will return false and not add the object
	@PostMapping("/user/applytojob")
	public ResponseEntity<Boolean> applyToJob(@RequestBody applyJob apply)
	{
		String socialId = ApplyJobView.getSocialId(apply.getUserId());
		if(credentials.isCVUploaded(socialId)==false) {
			System.out.println("-----CV Not uploaded !!!!please upload CV and try again");
			return ResponseEntity.ok().body(false);
		}
		boolean status=ApplyJobView.addApplyJob(apply);
		return ResponseEntity.ok().body(status);
	}
	
	//Used to get application for specific job using userId and JobId
	@GetMapping("/user/getapplication")
	public ResponseEntity<applyJob> getApplicationByUserId(@RequestParam("userId") int userId,
			@RequestParam("jobId") int jobId)
	{
		applyJob obj=null;
		obj=ApplyJobView.getMyapplicationForJobid(userId, jobId);
		return ResponseEntity.ok().body(obj);
		
	}
	
	//Used to update previous application by user
	@PostMapping("/user/update")
	public ResponseEntity<Boolean> updateAppliedJob(@RequestBody applyJob apply)
	{
		boolean resp=ApplyJobView.updateApplyJob(apply);
		return ResponseEntity.ok().body(resp);
		
	}
	
	//Gets all job applications for specific job id and is used by the admin
	@GetMapping("/admin/getallapplications")
	public ResponseEntity<List<applyJob>> getAllJobsByJobId(@RequestParam("jobId") int jobId)
	{
		try 
		{
		return ResponseEntity.ok().body(ApplyJobView.getAllApplicationForJobid(jobId));
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return ResponseEntity.ok().body(null);
		}
	}
	
	
	
	//Removes Application for job by applyJob id!!! Returns true if removed Successfully
	@GetMapping("/superadmin/remove")
	public ResponseEntity<Boolean> removeApplyJobById(@RequestParam("id") int id )
	{
		return ResponseEntity.ok().body(ApplyJobView.removeApplyJobById(id));
	}
	
	//Used to get Application for specific apply Job id
	@GetMapping("/superadmin/getapplication/{id}")
	public ResponseEntity<applyJob> getApplyJobById(@PathVariable int id )
	{
		return ResponseEntity.ok().body(ApplyJobView.getApplyJob(id));
	}
	
	
	//Used to get All Applications
	@GetMapping("/superadmin/getallapplication")
	public ResponseEntity<List<applyJob>> getAllapplyJobs( )
	{
		return ResponseEntity.ok().body(ApplyJobView.getAllApplyJobs());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
