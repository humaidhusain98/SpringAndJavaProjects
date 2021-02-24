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
import com.humaid.ws.api.models.Job;

public class SearchJobView 
{

	public static List<Job> filterByExp(int minExp,int maxExp,List<Job> jobs)
	{
		List<Job> filteredJoblist=null;
		if(minExp==-1 && maxExp==-1) 
		{
			return jobs;//Returning as it is
		}
		//Only min Experience is specified
		if(minExp!=-1 && maxExp==-1) 
		{
			for(int i=0;i<jobs.size();i++)
			{
				
				Job objJob=jobs.get(i);
				if(minExp<=objJob.getExpStart())
				{
					if(filteredJoblist==null) 
					{
						filteredJoblist=new ArrayList<Job>();
					}
					filteredJoblist.add(objJob);
					
				}
					
				
			}//For loop to loop every job
			return filteredJoblist;
		
		}//end of if
		
		//Only upper limit is specified
		if(minExp==-1 && maxExp!=-1) 
		{
			for(int i=0;i<jobs.size();i++)
			{
				
				Job objJob=jobs.get(i);
				if(maxExp>=objJob.getExpEnd())
				{
					if(filteredJoblist==null) 
					{
						filteredJoblist=new ArrayList<Job>();
					}
					filteredJoblist.add(objJob);
					
				}
					
				
			}//For loop to loop every job
			return filteredJoblist;
		
		}//end of if
		
		
		if(minExp!=-1 && maxExp!=-1) 
		{
			for(int i=0;i<jobs.size();i++)
			{
				
				Job objJob=jobs.get(i);
				if(maxExp>=objJob.getExpEnd() && minExp<=objJob.getExpStart())
				{
					if(filteredJoblist==null) 
					{
						filteredJoblist=new ArrayList<Job>();
					}
					filteredJoblist.add(objJob);
					
				}
					
				
			}//For loop to loop every job
			return filteredJoblist;
		
		}//end of if
		
		
		return filteredJoblist;
	}

	
	public static List<Job> filterByCompensation(int minSal,int maxSal,List<Job> jobs)
	{
		List<Job> filteredJoblist=null;
		if(minSal==-1 && maxSal==-1) 
		{
			return jobs;//Returning as it is
		}
		//Only min Experience is specified
		if(minSal!=-1 && maxSal==-1) 
		{
			for(int i=0;i<jobs.size();i++)
			{
				
				Job objJob=jobs.get(i);
				if(minSal<=objJob.getSalaryStart())
				{
					if(filteredJoblist==null) 
					{
						filteredJoblist=new ArrayList<Job>();
					}
					filteredJoblist.add(objJob);
					
				}
					
				
			}//For loop to loop every job
			return filteredJoblist;
		
		}//end of if
		
		//Only upper limit is specified
		if(minSal==-1 && maxSal!=-1) 
		{
			for(int i=0;i<jobs.size();i++)
			{
				
				Job objJob=jobs.get(i);
				if(maxSal>=objJob.getSalaryEnd())
				{
					if(filteredJoblist==null) 
					{
						filteredJoblist=new ArrayList<Job>();
					}
					filteredJoblist.add(objJob);
					
				}
					
				
			}//For loop to loop every job
			return filteredJoblist;
		
		}//end of if
		
		
		if(minSal!=-1 && maxSal!=-1) 
		{
			for(int i=0;i<jobs.size();i++)
			{
				
				Job objJob=jobs.get(i);
				if(maxSal>=objJob.getSalaryEnd() && minSal<=objJob.getSalaryStart())
				{
					if(filteredJoblist==null) 
					{
						filteredJoblist=new ArrayList<Job>();
					}
					filteredJoblist.add(objJob);
					
				}
					
				
			}//For loop to loop every job
			return filteredJoblist;
		
		}//end of if
		
		
		return filteredJoblist;
	}
	
	
	
	
	
	
	
	
	
	//Working correctly!!!
	public static List<Job> unionofTwoJobsList(List<Job> list1,List<Job> list2)
	{
		List<Job> unionList=null;
		Set<Job> jobset=new HashSet<Job>();
		for(int i=0;i<list1.size();i++)
		{
			jobset.add(list1.get(i));
			
		}
		for(int i=0;i<list2.size();i++)
		{
			jobset.add(list2.get(i));
			
		}
		Iterator<Job> iterator=jobset.iterator();
		while(iterator.hasNext()) 
		{
			if(unionList==null) {
				unionList=new ArrayList<Job>();
			}
			unionList.add(iterator.next());
			
		}

		return unionList;
	}
	
	
	
	//Searches and fetches all jobs with competency name mapping
	public static List<Job> searchJobByCompetency(String competencyKey)
	{
	List<Job> searchjobList=null;
	Set<Integer> jobidlist=new HashSet<Integer>();
	String query = "SELECT * FROM jobcompetencymetric WHERE competencyname ilike '%"+competencyKey+"%'";
	ResultSet results = null;
    Connection conn = null;
    PreparedStatement ptstmnt = null;
    
    try 
    {
    	
        BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//        System.out.println("Datasource ===="+dataSource);
        
        
        conn = dataSource.getConnection();
//        System.out.println("conn obj ==="+conn);
        
        
        ptstmnt = conn.prepareStatement(query);
        System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
        
        
        results = ptstmnt.executeQuery();
//        System.out.println("ptstmnt obj query execution completed ==="+ptstmnt);
        
        //Do something with results
        while (results != null && results.next()) {
        	jobidlist.add(results.getInt(2));
        	
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
                 ptstmnt.close();
                 
             } catch (SQLException e) {
                 // TODO Auto-generated catch block
                 e.printStackTrace();
                
             }
            
         } 
    	
    	
    }
    
	try 
	{
		searchjobList=new ArrayList<Job>();
//		System.out.println("Iterating over jobidlist----------------------:"); 
	        Iterator<Integer> i = jobidlist.iterator(); 
	        while (i.hasNext()) 
	        {
	        	int id=i.next();
	        	Job objJob=JobView.getJob(id);
	        	if(objJob!=null)
	        		searchjobList.add(objJob);
	        	
	        }
	
	}
	catch (Exception e) 
	{
		e.printStackTrace();
	}
		
		
		
		
		
	return 	searchjobList;
	}
	
	
	//Searches the keyword in category1,category2,city,country
	//jobtitle,jobdescription,toprequirements
	public static List<Job> searchJobByKeyword(String keyword)
	{
		List<Job> searchjobList=null;
		String query = "SELECT * FROM jobs WHERE jobtitle ilike '%"
		+keyword+"%' OR city ilike '%"+keyword+
		"%' OR country ilike '%"+keyword+"%' OR jobdescription ilike '%"
		+keyword+"%' OR toprequirements ilike '%"
		+keyword+"%' OR category1 ilike '%"
		+keyword+"%' OR category2 ilike '%"+keyword+"%'";
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
	        	Job objJob=JobView.createNewJobObj(results);
	        	if(searchjobList==null)
	        	{
	        		searchjobList=new ArrayList<Job>();
	        	}
	        	
	        	if(objJob!=null) 
	        	{
	        		searchjobList.add(objJob);
	        		
	        	}
	        	
//	        	System.out.println(objJob.toString());
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
	                 ptstmnt.close();
	                 
	             } catch (SQLException e) {
	                 // TODO Auto-generated catch block
	                 e.printStackTrace();
	                
	             }
	            
	         } 
	    	
	    	
	    	
	    }
		
		
		
		return searchjobList;
		
	}
	
	
	
	
	
	public static List<Job> UltimateSearchAlgorithm(String keyword,
			int minExp,int maxExp,int minSal,int maxSal
			)
	{
		if(keyword.equals("-9999999999")) 
		{
			List<Job> allJobs=JobView.getAllJobs();
			List<Job> afterExpFilter =SearchJobView.filterByExp(minExp, maxExp, allJobs);
			List<Job> afterCompFilter=SearchJobView.filterByCompensation(minSal, maxSal, afterExpFilter);
			return afterCompFilter;
		}
		else 
		{
			List<Job> searchCompetency =SearchJobView.searchJobByCompetency(keyword);
			List<Job> searchJob 	= SearchJobView.searchJobByKeyword(keyword);
			//Applying union of searchCompetency  and SearchJob
			List<Job> unionResult 	= SearchJobView.unionofTwoJobsList(searchCompetency, searchJob);
			
			List<Job> afterExpFilter =SearchJobView.filterByExp(minExp, maxExp, unionResult);
			List<Job> afterCompFilter=SearchJobView.filterByCompensation(minSal, maxSal, afterExpFilter);
			return afterCompFilter;
			
		}
		
		
		
		
	}//Ultimate Search Algorithm
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String args[]) 
	{
		
//		List<Job> getallJobs=JobView.getAllJobs();
//		System.out.println("---------All Jobs------");
//		System.out.println(getallJobs);
//		System.out.println();
//		
//		
//		
//		List<Job> search = JobView.searchJobByCompetency("C++");
//		System.out.println("---------Search Jobs------");
//		System.out.println(search);
//		System.out.println();
//		
//		System.out.println("---------Union of Search Jobs and All Jobs------");
//		System.out.println(unionofTwoJobsList(getallJobs, search));
		
	}
	
	
	
	
	
}
