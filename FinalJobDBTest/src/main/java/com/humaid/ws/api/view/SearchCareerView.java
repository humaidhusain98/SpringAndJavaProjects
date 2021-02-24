package com.humaid.ws.api.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.dbcp.BasicDataSource;

import com.humaid.ws.api.DBHandler.DatabaseHandler;
import com.humaid.ws.api.models.User;


public class SearchCareerView {
	
	public static List<Integer> searchCompany(String keyword) 
	{
		List<Integer> companyList=null;
		String query ="SELECT id FROM public.company WHERE name ilike '%"+keyword+"%'";
		ResultSet results = null;
	    Connection conn = null;
	    PreparedStatement ptstmnt = null;
		try 
		{
			BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//	        System.out.println("Datasource ===="+dataSource);
	        
	        
	        conn = dataSource.getConnection();
//	        System.out.println("conn obj ==="+conn);
	        
	        
	        ptstmnt = conn.prepareStatement(query);
	        System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
	        
	        results = ptstmnt.executeQuery();
//	        System.out.println("ptstmnt obj query execution completed ==="+ptstmnt);
		
			while(results!=null && results.next()) 
			{
				int id=results.getInt(1);
				if(companyList==null) 
				{
					companyList=new ArrayList<Integer>();
				
				}
				companyList.add(id);
				
			}
			
			
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			 if (conn != null) {
	                try {
	                    conn.close();
	                    if (results != null)
	                        results.close();
	                    ptstmnt.close();
	                } catch (SQLException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
			
		}
	    
	    
	    
		return companyList;
	}
	
	
	public static List<Integer> searchCompetency(String keyword) 
	{
		List<Integer> competencyList=null;
		String query ="SELECT id FROM public.competency WHERE name ilike '%"+keyword+"%'";
		ResultSet results = null;
	    Connection conn = null;
	    PreparedStatement ptstmnt = null;
		try 
		{
			BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//	        System.out.println("Datasource ===="+dataSource);
	        
	        
	        conn = dataSource.getConnection();
//	        System.out.println("conn obj ==="+conn);
	        
	        
	        ptstmnt = conn.prepareStatement(query);
	        System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
	        
	        results = ptstmnt.executeQuery();
//	        System.out.println("ptstmnt obj query execution completed ==="+ptstmnt);
		
			while(results!=null && results.next()) 
			{
				int id=results.getInt(1);
				if(competencyList==null) 
				{
					competencyList=new ArrayList<Integer>();
				
				}
				competencyList.add(id);
				
			}
			
			
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			 if (conn != null) {
	                try {
	                    conn.close();
	                    if (results != null)
	                        results.close();
	                    ptstmnt.close();
	                } catch (SQLException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
			
		}
	    
	    
	    
		return competencyList;
	}
	
	
	public static List<Integer> searchProfession(String keyword) 
	{
		List<Integer> profList=null;
		String query ="SELECT id FROM public.profession WHERE name ilike '%"+keyword+"%'";
		ResultSet results = null;
	    Connection conn = null;
	    PreparedStatement ptstmnt = null;
		try 
		{
			BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//	        System.out.println("Datasource ===="+dataSource);
	        
	        
	        conn = dataSource.getConnection();
//	        System.out.println("conn obj ==="+conn);
	        
	        
	        ptstmnt = conn.prepareStatement(query);
	        System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
	        
	        results = ptstmnt.executeQuery();
//	        System.out.println("ptstmnt obj query execution completed ==="+ptstmnt);
		
			while(results!=null && results.next()) 
			{
				int id=results.getInt(1);
				if(profList==null) 
				{
					profList=new ArrayList<Integer>();
				
				}
				profList.add(id);
				
			}
			
			
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			 if (conn != null) {
	                try {
	                    conn.close();
	                    if (results != null)
	                        results.close();
	                    ptstmnt.close();
	                } catch (SQLException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
			
		}
	    
	    
	    
		return profList;
	}
	
	
	public static List<Integer> searchUserCompetencyMetric(int competencyid) 
	{
		List<Integer> userList=null;
		String query ="SELECT userid FROM public.usercompetencymetric WHERE competencyid="+competencyid;
		ResultSet results = null;
	    Connection conn = null;
	    PreparedStatement ptstmnt = null;
		try 
		{
			BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//	        System.out.println("Datasource ===="+dataSource);
	        
	        
	        conn = dataSource.getConnection();
//	        System.out.println("conn obj ==="+conn);
	        
	        
	        ptstmnt = conn.prepareStatement(query);
	        System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
	        
	        results = ptstmnt.executeQuery();
//	        System.out.println("ptstmnt obj query execution completed ==="+ptstmnt);
		
			while(results!=null && results.next()) 
			{
				int id=results.getInt(1);
				if(userList==null) 
				{
					userList=new ArrayList<Integer>();
				
				}
				userList.add(id);
				
			}
			
			
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			 if (conn != null) {
	                try {
	                    conn.close();
	                    if (results != null)
	                        results.close();
	                    ptstmnt.close();
	                } catch (SQLException e) {
	                    // TODO Auto-generated catch block
	                    e.printStackTrace();
	                }
	            }
			
		}
	    
	    
	    
		return userList;
	}
	
	public static List<User> unionofTwoUserList(List<User> list1,List<User> list2)
	{
		List<User> unionList=null;
		Set<User> userset=new HashSet<User>();
		for(int i=0;i<list1.size();i++)
		{
			userset.add(list1.get(i));
			
		}
		for(int i=0;i<list2.size();i++)
		{
			userset.add(list2.get(i));
			
		}
		Iterator<User> iterator=userset.iterator();
		while(iterator.hasNext()) 
		{
			if(unionList==null) {
				unionList=new ArrayList<User>();
			}
			unionList.add(iterator.next());
			
		}

		return unionList;
	}
	
	
	public static List<User> getAllUserafterCompanySearch(String keyword)
	{
		List<User> userList=null;
		List<Integer> companyIdList=searchCompany(keyword);
		if(companyIdList!=null)
		{
			for(int i=0;i<companyIdList.size();i++) 
			{
				try 
				{
					List<User> users=UserView.getUserFromColValue(companyIdList.get(i),"currentcompanyid");
					if(userList==null)
						{userList=new ArrayList<User>();}
					if(users!=null) 
					{
					userList= unionofTwoUserList(userList, users);
					}
				}
				catch(SQLException e) 
				{
					e.printStackTrace();
				}
			}
		}
		
		
		return userList;
	}
	
	public static List<Integer> unionofTwoIntegerList(List<Integer> list1,List<Integer> list2)
	{
		List<Integer> unionList=null;
		Set<Integer> userset=new HashSet<Integer>();
		for(int i=0;i<list1.size();i++)
		{
			userset.add(list1.get(i));
			
		}
		for(int i=0;i<list2.size();i++)
		{
			userset.add(list2.get(i));
			
		}
		Iterator<Integer> iterator=userset.iterator();
		while(iterator.hasNext()) 
		{
			if(unionList==null) {
				unionList=new ArrayList<Integer>();
			}
			unionList.add(iterator.next());
			
		}

		return unionList;
	}
	
	
	
	
	
	
	
	
	public static List<User> getAllUserafterCompetencySearch(String keyword)
	{
		List<User> userList=null;
		List<Integer> unionOfUserId=new ArrayList<Integer>();
		List<Integer> competencyList=searchCompetency(keyword);
		System.out.println(competencyList);
		if(competencyList!=null)
		{
			for(int i=0;i<competencyList.size();i++) 
			{
				List<Integer> getUserIdList= searchUserCompetencyMetric(competencyList.get(i));
				if(getUserIdList!=null) 
				{
					unionOfUserId = unionofTwoIntegerList(unionOfUserId, getUserIdList);
				}
				System.out.println(unionOfUserId);
			}
			for(int i=0;i<unionOfUserId.size();i++) 
			{
				if(userList==null) 
				{
					userList=new ArrayList<User>();
				}
				try 
				{	User objUser=UserView.getUserFromColValue(unionOfUserId.get(i), "id").get(0);
					userList.add(objUser);
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
			}
		}
		
		
		return userList;
	}
	
	
	public static List<User> getAllUserafterProfessionSearch(String keyword)
	{
		List<User> userList=null;
		List<Integer> professionIdList=searchProfession(keyword);
		if(professionIdList!=null)
		{
		for(int i=0;i<professionIdList.size();i++) 
		{
			try 
			{
			List<User> users=UserView.getUserFromColValue(professionIdList.get(i),"currentprofessionid");
				if(userList==null)
					{userList=new ArrayList<User>();}
				if(users!=null)
				{
				userList= unionofTwoUserList(userList, users);
				}
			}
			catch(SQLException e) 
			{
				e.printStackTrace();
			}
		}
		}
		
		
		return userList;
	}
	
	
	

	
	
	
	
	
	
	
	public static void main(String args[]) 
	{
//		System.out.println(searchCompany("TCS"));
//		System.out.println(searchCompany("Amazon"));
//		System.out.println(searchCompany("Flipkart"));
//		System.out.println(searchCompany("zon"));
//		System.out.println(searchCompetency("Python"));
//		System.out.println(searchUserCompetencyMetric(70));
		
//		List<Integer> list1= new ArrayList<Integer>();
//		List<Integer> list2= new ArrayList<Integer>();
//		list1.add(1);
//		list1.add(2);
//		list1.add(3);
//		list2.add(2);
//		list2.add(3);
//		list2.add(4);
//		System.out.println(unionofTwoUserList(list1, list2));
		
//		System.out.println(searchProfession("Dev"));
		
//		
		List<User> user= getAllUserafterCompanySearch("Amazon");
		if(user!=null) 
		{
		for(int i=0;i<user.size();i++) 
		{
			System.out.println(user.get(i).toString());
		}
////		
//		}
		
		
		}

	}//static void main()!!!!
	
	
}
