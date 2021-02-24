package com.humaid.ws.api.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.startup.CertificateCreateRule;
import org.apache.commons.dbcp.BasicDataSource;

import com.amazonaws.services.managedblockchain.model.Edition;
import com.amazonaws.services.sns.model.PublishRequest;
import com.humaid.ws.api.DBHandler.DatabaseHandler;
import com.humaid.ws.api.models.Career;

public class CareerView {
	
	public static Integer addCareer(Career career) 
	{
		
		Connection conn=null;
		PreparedStatement ptstmnt=null;
		ResultSet results=null;
		int careerid=-1;
		try 
		{
			 BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//           System.out.println("dataSource obj ==="+dataSource);
           
			 conn = dataSource.getConnection();
//           System.out.println("conn obj ==="+conn);
			 
			 String query="INSERT INTO public.career(dateadded,industry1,industry2,topic,type,description,title)"
			 		+ "VALUES('"+career.getDateAdded()+"','"+career.getIndustry1()+"','"
			 		+ career.getIndustry2()+"','"+career.getTopic()+"',"+career.getType()+",'"+career.getDescription()+"','"+career.getTitle()+"')";
           
			 ptstmnt = conn.prepareStatement(query);
	         System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
			 
			 ptstmnt.executeUpdate();
	         ptstmnt.close();
	         
	           
	         query = "select max(id) from public.career";
	         ptstmnt=conn.prepareStatement(query);
	         results=ptstmnt.executeQuery();
	         if(results!=null && results.next()) 
	         {
	        	 careerid=results.getInt(1);
	        	 
	         }
	         
	         
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			  if (conn != null) 
			  {
	                try 
	                {
	                    conn.close();
	                    ptstmnt.close();
	                    
	                } 
	                catch (SQLException e) 
	                {
	                    e.printStackTrace();   
	                }
	               
	           } 
			
		}
		
		return careerid;
	}
	
	
	
	public static boolean removeCareer(int id) 
	{
		boolean status=false;
		Connection conn=null;
		PreparedStatement ptstmnt=null;
		try 
		{
			 BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//           System.out.println("dataSource obj ==="+dataSource);
           
			 conn = dataSource.getConnection();
//           System.out.println("conn obj ==="+conn);
			 
			 String query="DELETE FROM career WHERE id="+id;
           
			 ptstmnt = conn.prepareStatement(query);
	         System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
			 
			 ptstmnt.executeUpdate();
			status=true;
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			  if (conn != null) 
			  {
	                try 
	                {
	                    conn.close();
	                    ptstmnt.close();
	                    
	                } 
	                catch (SQLException e) 
	                {
	                    e.printStackTrace();   
	                }
	               
	           } //if block
			
		}
		
		return status;
		
	}
	
	
	
	public static boolean edit(Career career) 
	{
		
		boolean status=false;
		Connection conn=null;
		PreparedStatement ptstmnt=null;
		ResultSet results=null;
		try 
		{
			 BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//           System.out.println("dataSource obj ==="+dataSource);
           
			 conn = dataSource.getConnection();
//           System.out.println("conn obj ==="+conn);
			 
			 String query="UPDATE career SET dateadded='"+career.getDateAdded()+"', industry1='"+career.getIndustry1()
			 +"', industry2='"+career.getIndustry2()+"', topic='"+career.getTopic()+"', type="+career.getType()+", description='"+career.getDescription()
			 +"', title='"+career.getTitle()+"' WHERE id="+career.getId();
			 
			 ptstmnt = conn.prepareStatement(query);
	         System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
			 
			 ptstmnt.executeUpdate();
			 status=true;
			
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
			
		}
		finally 
		{
			  if (conn != null) 
			  {
	                try 
	                {
	                    conn.close();
	                    ptstmnt.close();
	                    
	                } 
	                catch (SQLException e) 
	                {
	                    e.printStackTrace();   
	                }
	               
	           } //if block
			
			
		}
		
		
		return status;
		
	}
	
	
	public static Career getCareerById(int id) 
	{
		Career obj=null;
		Connection conn=null;
		PreparedStatement ptstmnt=null;
		ResultSet results=null;
		try
		{
			 BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//           System.out.println("dataSource obj ==="+dataSource);
           
			 conn = dataSource.getConnection();
//           System.out.println("conn obj ==="+conn);
			 
			 String query="SELECT * FROM career WHERE id="+id;
	           
			 ptstmnt = conn.prepareStatement(query);
	         System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
			 
	         results=ptstmnt.executeQuery();
	         if(results!=null && results.next()) 
	         {
	        	 obj=createNewCareerObj(results);
	        	 
	         }
			
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			 if (conn != null) 
			  {
	                try 
	                {
	                    conn.close();
	                    ptstmnt.close();
	                    
	                } 
	                catch (SQLException e) 
	                {
	                    e.printStackTrace();   
	                }
	               
	           } //if block
			
		}
		
		
		
		
		return obj;
	}
	
	public static List<Career> getAllCareer() 
	{
		List<Career> careerlist=null;
		Connection conn=null;
		PreparedStatement ptstmnt=null;
		ResultSet results=null;
		try
		{
			 BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//           System.out.println("dataSource obj ==="+dataSource);
           
			 conn = dataSource.getConnection();
//           System.out.println("conn obj ==="+conn);
			 
			 String query="SELECT * FROM career";
	           
			 ptstmnt = conn.prepareStatement(query);
	         System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
			 
	         results=ptstmnt.executeQuery();
	         while(results!=null && results.next()) 
	         {
	        	 if(careerlist==null) 
	        	 {
	        		 careerlist=new ArrayList<Career>();
	        	 }
	        	 Career obj=createNewCareerObj(results);
	        	 careerlist.add(obj);
	        	 
	         }
			
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			 if (conn != null) 
			  {
	                try 
	                {
	                    conn.close();
	                    ptstmnt.close();
	                    
	                } 
	                catch (SQLException e) 
	                {
	                    e.printStackTrace();   
	                }
	               
	           } //if block
			
		}
		
		
		
		
		return careerlist;
	}
	
	

	
	public static Career createNewCareerObj(ResultSet results) 
	{
		Career obj=null;
		try 
		{
			obj=new Career();
			obj.setId(results.getInt(1));
			obj.setIndustry1(results.getString(2));
			obj.setIndustry2(results.getString(3));
			obj.setDateAdded(results.getString(4));
			obj.setTopic(results.getString(5));
			obj.setType(results.getInt(6));
			obj.setDescription(results.getString(7));
			obj.setTitle(results.getString(8));
		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
		
		return obj;
	}
	
	
	
	
	
	
	
	
	public static void main(String args[]) 
	{
	Career obj=new Career(2, "Industry12", "Industry12", "description2", "topic2", 1,"Title2");
	System.out.println(addCareer(obj));
	System.out.println(getAllCareer());
//		System.out.println(removeCareer(1));
//	System.out.println(getCareerById(3));
	
	
	
	}
	
	
	

}
