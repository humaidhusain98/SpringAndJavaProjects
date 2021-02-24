package com.humaid.aws.sns.dbHandler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


import com.humaid.aws.sns.model.balance;
import com.humaid.aws.sns.model.counter;

public class balAndCounterDbHandler {

	public static counter readCounterFromFile() {
		String path =  System.getProperty("user.home");
		String fileName="counter.csv";
		String filePath=path+"/"+fileName;
		String line="";
		counter count=null;
		try 
		{
		
			BufferedReader br=new BufferedReader(new FileReader(filePath));
			if((line=br.readLine())!=null) 
			{
				count=new counter(1, Integer.parseInt(line));
			}
			br.close();
			return count;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}//ReadCounterFromFile
	
	public static balance readBalFromFile() {
		String path =  System.getProperty("user.home");
		String fileName="balance.csv";
		String filePath=path+"/"+fileName;
		String line="";
		balance bal=null;
		try 
		{
		
			BufferedReader br=new BufferedReader(new FileReader(filePath));
			//Taking second line
			if((line=br.readLine())!=null) 
			{
				bal=new balance(1, Integer.parseInt(line));
			}
			br.close();
			return bal;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	
	public static boolean reWriteCounterFile(counter count ) 
	{
		boolean resp=false;
		try 
		{
			String path =  System.getProperty("user.home");
			String fileName="counter.csv";
			String filePath=path+"/"+fileName;
			FileWriter fw=new FileWriter(filePath);
			BufferedWriter bWriter= new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bWriter);
			pw.println(count.getCount());
			pw.flush();
			pw.close();
			resp=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		return resp;
	} 
	
	public static boolean reWriteBalanceFile(balance bal ) 
	{
		boolean resp=false;
		try 
		{
			String path =  System.getProperty("user.home");
			String fileName="balance.csv";
			String filePath=path+"/"+fileName;
			FileWriter fw=new FileWriter(filePath);
			BufferedWriter bWriter= new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bWriter);
			pw.println(bal.getBal());
			pw.flush();
			pw.close();
			resp=true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		return resp;
	} 
	

	
	
	
}
