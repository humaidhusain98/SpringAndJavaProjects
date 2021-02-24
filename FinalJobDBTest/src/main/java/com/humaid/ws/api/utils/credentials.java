package com.humaid.ws.api.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.CannedAccessControlList;
import com.amazonaws.services.s3.model.PutObjectRequest;



public class credentials 
{
	
//--------------------------------------------------------------------------------------------------
	 static BasicAWSCredentials awsCreds = new BasicAWSCredentials("AKIA2V3UKB5LLAYJ2TME",
	            "mp5vyV1OyEFFRsZ0KJAvJL+txx6XQzDaFZlDVStu");
	
	 static AmazonS3 s3client = AmazonS3ClientBuilder.standard()
	            .withCredentials(new AWSStaticCredentialsProvider(awsCreds)).withRegion(Regions.AP_SOUTH_1).build();
//-------------------------------------------------CREDENTIALS---------------------------------------	 
	 
//	   public static boolean updateCV(MultipartFile cvUpload, String socialId,int userId) {
//	        try {
//	        	
//	            String cvUrl = uploadCV(cvUpload, socialId);
//	            if(cvUrl == null) {
//	                return false;
//	            }
//	            cvUrl = "https://democvupload.s3.ap-south-1.amazonaws.com/" + socialId + "/" + cvUrl;
//	            //Deleting OLD CV if present
//	            if(CVView.isCVPresent(userId)==true) 
//	            {
//	            	CVView.removeCVData(userId);	
//	            }
//	            CVView.addCVData(userId, cvUrl);
//	            
//	            return true;
//	        } catch (Exception e) {
//	            // TODO Auto-generated catch block
//	            e.printStackTrace();
//	            return false;
//	        }
//	        
//	    }
//	 
	 
	 
	 
	 
	    public static boolean uploadCV(MultipartFile cv, String socialId) {
	        String bucketName = "democvupload";
	        File convFile;
	        try {
	            convFile = convertMultiPartToFile(cv);
	            String fileName = "cv_" + socialId + ".pdf";
	            String key = socialId + "/" + fileName;
//	            System.out.println("Key = " + key);
	            s3client.putObject(new PutObjectRequest(bucketName, key, convFile)
	                        .withCannedAcl(CannedAccessControlList.PublicRead));
	            convFile.delete();
	            System.out.println(key);
	            return true;
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            return false;
	        }
	    }
	    
	    
	    public static File convertMultiPartToFile(MultipartFile file) throws IOException {
	        File convFile = new File(file.getOriginalFilename());
	        FileOutputStream fos = new FileOutputStream(convFile);
	        fos.write(file.getBytes());
	        fos.close();
	        return convFile;
	    }
	    
	    
	 
	    public static boolean deleteCV(String CVUrl) 
	    {
	    	int count=0;
	    	int i=0;
	    	while(true) 
	    	{
	    		if(CVUrl.charAt(i)=='/')
	    			count++;
	    		i++;
	    		if(count==3)
	    			break;	
	    		
	    	}
	    	String key=CVUrl.substring(i);
	    	System.out.println(key);
	    	try 
	    	{
	    		s3client.deleteObject("democvupload", key);
	    		return true;
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    		return false;
				// TODO: handle exception
			}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    }
	    
	    public static boolean isCVUploaded(String socialId) 
	    {
	    	boolean status=false;
	    	 String bucketName = "democvupload";
	    	 String fileName = "cv_" + socialId + ".pdf";
	         String key = socialId + "/" + fileName;
	    	 
	         status = s3client.doesObjectExist(bucketName,key);
	    	
	    	
	    	return status;
	    	
	    }
	    
	    
	 

	
	
	
}


//AKIA2V3UKB5LLAYJ2TME
	//mp5vyV1OyEFFRsZ0KJAvJL+txx6XQzDaFZlDVStu
