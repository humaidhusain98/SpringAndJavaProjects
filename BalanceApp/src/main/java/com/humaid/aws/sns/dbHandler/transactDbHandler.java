package com.humaid.aws.sns.dbHandler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import com.humaid.aws.sns.model.Transact;




public class transactDbHandler {

	public static List<Transact> readTransactionsFromFile() {
		String path =  System.getProperty("user.home");
		String fileName="transaction.csv";
		String filePath=path+"/"+fileName;
		String line="";
		try 
		{
			List<Transact> transactlist=new ArrayList<Transact>();
			BufferedReader br=new BufferedReader(new FileReader(filePath));
			while((line=br.readLine())!=null) 
			{
				String[] values=line.split(",");
				Transact transactobj=new Transact(Integer.parseInt(values[0]), Integer.parseInt(values[1]), values[2], values[3],Boolean.parseBoolean(values[4]));
				transactlist.add(transactobj);
				//Operations To do
			
			}
			br.close();
			return transactlist;
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}//ReadFile
	
	public static boolean addTransactionToFile( Transact transact)
	
	{
		try 
		{
			String path =  System.getProperty("user.home");
			String fileName="transaction.csv";
			String filePath=path+"/"+fileName;
			FileWriter fw=new FileWriter(filePath,true);
			BufferedWriter bWriter= new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bWriter);
			pw.println(transact.getId()+","+transact.getAmt()+","+transact.getDate()+","+transact.getDescription()+","+transact.isPutin());
			pw.flush();
			pw.close();
			System.out.println("Writing to transaction.csv File Done Successfully!!!");
			return true;
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		
	}//writeFile
	
	public static boolean reWriteTransactionFile(List<Transact> transactList) 
	{
		boolean resp=false;
		try 
		{
			String path =  System.getProperty("user.home");
			String fileName="transaction.csv";
			String filePath=path+"/"+fileName;
			FileWriter fw=new FileWriter(filePath);
			BufferedWriter bWriter= new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bWriter);
			for(int i=0;i<transactList.size();i++) 
			{
				pw.println(transactList.get(i).getId()+","+transactList.get(i).getAmt()+","+transactList.get(i).getDate()+","+transactList.get(i).getDescription());
			}
			pw.flush();
			pw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		return resp;
	} 
	
	

	
	
	
	
}
