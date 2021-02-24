package com.humaid.ws.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.humaid.ws.api.utils.credentials;





@RestController
@RequestMapping("/cv")
public class CVController 
{
	
		// used to upload CV to S3 Bucket and then maps userid with CVURL in usercvmetric TABLE
		@ResponseBody
	    @RequestMapping(value = "/upload", method = RequestMethod.POST)
	    public ResponseEntity<Boolean> updateCV(@RequestParam("file") MultipartFile file,
	    @RequestParam("socialId") String socialId
	    		) {
	        System.out.println("IN API CALL");
	        
	        boolean isUpdated = credentials.uploadCV(file, socialId);
	      
	        return ResponseEntity.ok().body(isUpdated);
	    }

		
//		//Deletes the CV uploaded to s3 Bucket and then removes mapping from usercvmetric
//		@RequestMapping(value = "/delete", method = RequestMethod.POST)
//		public ResponseEntity<Boolean> DeleteCV(@RequestParam("userId") int userId ) 
//		{
//			boolean resp = CVView.isCVPresent(userId);
//			if(resp==false) 
//			{
//				System.out.println("CVURL DATA not present in Database!!!!!!!!!");
//				return ResponseEntity.ok().body(true);
//			}
//			String CVURL= CVView.getCVUrl(userId);
//			resp=credentials.deleteCV(CVURL);
//			resp=CVView.removeCVData(userId);
//			return ResponseEntity.ok().body(resp);
//			
//		}
		
		@RequestMapping(value = "/isuploaded/{socialId}", method = RequestMethod.GET)
		public ResponseEntity<Boolean> isCVPresent(@PathVariable String socialId) 
		{
			boolean resp=credentials.isCVUploaded(socialId);
			return ResponseEntity.ok().body(resp);
			
	
		}
		
		
		
		
		
}
