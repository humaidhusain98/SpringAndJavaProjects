package com.humaid.ws.api.config;

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
	 
	   public static boolean updateCV(MultipartFile profilePic, String socialId, String accessToken) {
	        try {
	        	
	            String cvUrl = uploadCV(profilePic, socialId);
	            if(cvUrl == null) {
	                return false;
	            }
	            cvUrl = "https://democvupload.s3.ap-south-1.amazonaws.com/" + socialId + "/" + cvUrl;
	            System.out.println("CVURL ===========" +cvUrl);
	            return true;
	        } catch (Exception e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            return false;
	        }
	        
	    }
	 
	 
	 
	 
	 
	    public static String uploadCV(MultipartFile cv, String socialId) {
	        String bucketName = "democvupload";
	        File convFile;
	        try {
	            convFile = convertMultiPartToFile(cv);
	            String fileName = "cv_" + System.currentTimeMillis() + ".pdf";
	            String key = socialId + "/" + fileName;
	            System.out.println("Key = " + key);
	            s3client.putObject(new PutObjectRequest(bucketName, key, convFile)
	                        .withCannedAcl(CannedAccessControlList.PublicRead));
	            convFile.delete();
	            return fileName;
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	            return null;
	        }
	    }
	    
	    
	    public static File convertMultiPartToFile(MultipartFile file) throws IOException {
	        File convFile = new File(file.getOriginalFilename());
	        FileOutputStream fos = new FileOutputStream(convFile);
	        fos.write(file.getBytes());
	        fos.close();
	        return convFile;
	    }
	    
	    
	 

	 
	 

	
	
	//AKIA2V3UKB5LLAYJ2TME
	//mp5vyV1OyEFFRsZ0KJAvJL+txx6XQzDaFZlDVStu
}
