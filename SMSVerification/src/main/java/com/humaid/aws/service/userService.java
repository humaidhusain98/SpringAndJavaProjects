package com.humaid.aws.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.humaid.aws.entity.User;
import com.humaid.aws.repo.UserRepo;

@Service
public class userService 
{
	@Autowired
	private UserRepo repo;
	
	public  User fetchUserByMobileNumber(String phoneNumber) 
	{
		User objUser=repo.findById(phoneNumber).orElse(null);
		
		return objUser;
		
	}
	
	public User saveUser(User userObj) 
	{
		try 
		{
			repo.save(userObj);
			return userObj;
			
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			return null;
			
		}
		
	}
	
	public User deleteUser(User userObj) 
	{
		try 
		{
			repo.delete(userObj);
			return userObj;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return null;
			
		}
		
	}
	
	public String deleteUserByMobile(String mobile) 
	{
		
		try 
		{
			repo.deleteById(mobile);
			return mobile;
		}
		catch(Exception e) 
		{
			System.out.println(e.getMessage());
			return null;
		}
		
		
	}
	
		
	
	

}
