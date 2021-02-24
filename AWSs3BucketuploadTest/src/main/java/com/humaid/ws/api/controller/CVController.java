package com.humaid.ws.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.humaid.ws.api.config.credentials;



@RestController
@RequestMapping("/cv")
public class CVController 
{
		@ResponseBody
	    @RequestMapping(value = "/upload", method = RequestMethod.POST)
	    public ResponseEntity<?> updateCV(@RequestParam("file") MultipartFile file,
	    @RequestParam("socialId") String socialId,
	    @RequestParam("accessToken") String accessToken) {
	        System.out.println("IN API CALL");
	        
	        boolean isUpdated = credentials.updateCV(file, socialId, accessToken);
	        if(isUpdated) {
	            return new ResponseEntity<Object>("Update Successful", HttpStatus.OK);
	        }
	        return  new ResponseEntity<Object>("Update failed", HttpStatus.INTERNAL_SERVER_ERROR);
	    }

}
