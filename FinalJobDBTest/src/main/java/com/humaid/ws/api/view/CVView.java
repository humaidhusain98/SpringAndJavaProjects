//package com.humaid.ws.api.view;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//import org.apache.commons.dbcp.BasicDataSource;
//
//import com.humaid.ws.api.DBHandler.DatabaseHandler;
//
//
//public class CVView 
//{
//	public static boolean isCVPresent(int userId) 
//	{
//		boolean status=false;
//		Connection conn=null;
//		PreparedStatement ptstmnt=null;
//		ResultSet results=null;
//		try 
//		{
//			
//			BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//			System.out.println("dataSource obj ==="+dataSource);
//			
//		    conn = dataSource.getConnection();
//	        System.out.println("conn obj ==="+conn);
//	        
//	        String query="SELECT * FROM usercvmetric WHERE userid="+userId;
//	        ptstmnt = conn.prepareStatement(query);
//	        System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
//	        
//	        results = ptstmnt.executeQuery();
//	        
//	        if(results!=null && results.next()) 
//	        {
//	        	status=true;
//	        }
//	        
//	        
//		}
//		catch(SQLException e) 
//		{
//			e.printStackTrace();
//			status=false;
//		}
//		finally 
//		{
//			  if (conn != null) 
//			  {
//	                try 
//	                {
//	                    conn.close();
//	                    if (results != null)
//	                        results.close();
//	                    ptstmnt.close();
//	                }
//	                catch (SQLException e) 
//	                {
//	                    // TODO Auto-generated catch block
//	                    e.printStackTrace();
//	                }
//	          }
//			
//		}
//		return status;
//		
//
//	}//isCVPRESENT?
//	
//	
//	
//	public static boolean addCVData(int userId,String CVUrl) 
//	{
//		boolean status=false;
//		Connection conn=null;
//		PreparedStatement ptstmnt=null;
//		ResultSet results=null;
//		try 
//		{
//			
//			BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//			System.out.println("dataSource obj ==="+dataSource);
//			
//		    conn = dataSource.getConnection();
//	        System.out.println("conn obj ==="+conn);
//	        
//	        String query="INSERT INTO public.usercvmetric VALUES("+userId+",'"+CVUrl+"')";
//	        ptstmnt = conn.prepareStatement(query);
//	        System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
//	        
//	        ptstmnt.executeUpdate();
//	        System.out.println("ptstmnt obj query Executed statment completed  ==="+ptstmnt);
//	        status=true;
//	        
//		}
//		catch(SQLException e) 
//		{
//			e.printStackTrace();
//			status=false;
//		}
//		finally 
//		{
//			  if (conn != null) 
//			  {
//	                try 
//	                {
//	                    conn.close();
//	                    if (results != null)
//	                        results.close();
//	                    ptstmnt.close();
//	                }
//	                catch (SQLException e) 
//	                {
//	                    // TODO Auto-generated catch block
//	                    e.printStackTrace();
//	                }
//	          }
//			
//		}
//		return status;
//		
//
//	}// addCVDATA method
//	
//	
//	
//	public static boolean removeCVData(int userId) 
//	{
//		boolean status=false;
//		Connection conn=null;
//		PreparedStatement ptstmnt=null;
//		ResultSet results=null;
//		try 
//		{
//			
//			BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//			System.out.println("dataSource obj ==="+dataSource);
//			
//		    conn = dataSource.getConnection();
//	        System.out.println("conn obj ==="+conn);
//	        
//	        String query="DELETE FROM public.usercvmetric WHERE userid="+userId;
//	        ptstmnt = conn.prepareStatement(query);
//	        System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
//	        
//	        ptstmnt.executeUpdate();
//	        System.out.println("ptstmnt obj query Executed statment completed  ==="+ptstmnt);
//	        status=true;
//	        
//		}
//		catch(SQLException e) 
//		{
//			e.printStackTrace();
//			status=false;
//		}
//		finally 
//		{
//			  if (conn != null) 
//			  {
//	                try 
//	                {
//	                    conn.close();
//	                    if (results != null)
//	                        results.close();
//	                    ptstmnt.close();
//	                }
//	                catch (SQLException e) 
//	                {
//	                    // TODO Auto-generated catch block
//	                    e.printStackTrace();
//	                }
//	          }
//			
//		}
//		return status;
//		
//
//	}// addCVDATA method
//	
//	
//	public static String getCVUrl(int userId) 
//	{
//		boolean status=false;
//		Connection conn=null;
//		PreparedStatement ptstmnt=null;
//		ResultSet results=null;
//		try 
//		{
//			
//			BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//			System.out.println("dataSource obj ==="+dataSource);
//			
//		    conn = dataSource.getConnection();
//	        System.out.println("conn obj ==="+conn);
//	        
//	        String query="SELECT * FROM usercvmetric WHERE userid="+userId;
//	        ptstmnt = conn.prepareStatement(query);
//	        System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
//	        
//	        results = ptstmnt.executeQuery();
//	        
//	        if(results!=null && results.next()) 
//	        {
//	        	return results.getString(2);
//	        }
//	        
//	        
//		}
//		catch(SQLException e) 
//		{
//			e.printStackTrace();
//			status=false;
//		}
//		finally 
//		{
//			  if (conn != null) 
//			  {
//	                try 
//	                {
//	                    conn.close();
//	                    if (results != null)
//	                        results.close();
//	                    ptstmnt.close();
//	                }
//	                catch (SQLException e) 
//	                {
//	                    // TODO Auto-generated catch block
//	                    e.printStackTrace();
//	                }
//	          }
//			
//		}
//		return null;
//		
//
//	}
//	
//	
//	
//	
//	
//	 public static void main(String args[])
//	    {
//		 
////---------------------Testing CV Controller Actions-----------------------
////		 System.out.println(addCVData(1, "www.google.com"));
////		 System.out.println(isCVPresent(1));
////		 System.out.println(removeCVData(1));
////		 System.out.println(isCVPresent(1));
//		 
//		 
//	    }
//	
//
//	
//	
//
//}
