
package com.humaid.ws.api.operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbcp.BasicDataSource;

import com.humaid.ws.api.DBhandler.DatabaseHandler;
import com.humaid.ws.api.entity.JobOld;

public class jobOperationsOld {
	//CREATE TABLE jobs syntax below !!!!!!!!!!!
	// (CORRECT ONE)CREATE TABLE jobs(id serial,dateJobCreated VARCHAR,dateTillValid VARCHAR,companyId int,category1 VARCHAR,category2 VARCHAR,jobTitle VARCHAR,salaryStart int,salaryEnd int,currency VARCHAR,city VARCHAR,country VARCHAR,expStart int,expEnd int,jobDescription VARCHAR,topRequirements VARCHAR,PRIMARY KEY(id))
	
	//FOR applyjob table
	//CREATE TABLE applyjob(id serial,userid int,dateapplied VARCHAR,mobile VARCHAR,currctc int,expctc int,currlocation VARCHAR,noticeperiod int,cvurl VARCHAR,competency1id int,competency2id int,competency3id int,jobid int,PRIMARY KEY(id))
	
	//Creating usercvmetric table
	//CREATE TABLE usercvmetric(userid int,cvurl VARCHAR)
	//Drop cvurl from peopl table
	//drop usercvmetric from peopl table
	
	//FOR CAREER
	//CREATE TABLE career(id serial,industry1 VARCHAR,industry2 VARCHAR,dateadded VARCHAR,topic VARCHAR,PRIMARY KEY(id))
	public static void createstaticJobTable() 
	{
	
    	String query="CREATE TABLE job(id SERIAL, title VARCHAR NOT NULL,date DATE,PRIMARY KEY(id))";
    	
        Connection conn = null;
        PreparedStatement ptstmnt = null;

        try {
            BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
            System.out.println("dataSource obj ==="+dataSource);
            
            conn = dataSource.getConnection();
            System.out.println("conn obj ==="+conn);
            
            ptstmnt = conn.prepareStatement(query);
            System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
            
            ptstmnt.executeUpdate();
            System.out.println("ptstmnt obj execute Update completed ==="+ptstmnt);

        } catch (SQLException e) {
            System.out.print(e.getMessage());
            
        } finally {
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
		
	}
	
	
	
	public static void addStaticValues() 
	{
	
    	
        Connection conn = null;
        PreparedStatement ptstmnt = null;

        try {
            BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
            System.out.println("dataSource obj ==="+dataSource);
            
            conn = dataSource.getConnection();
            System.out.println("conn obj ==="+conn);
            
        	for(int i=1;i<=1000;i++) 
    		{
        		String query="INSERT INTO public.job(title,date,proflen)\n" + 
        				"VALUES('FULL STack Dev-"+i+"'"+",'10-DEC-"+i+"'"+",0)\n" + 
        				"";
        		
        		   ptstmnt = conn.prepareStatement(query);
                   System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
                   
                   ptstmnt.executeUpdate();
                   System.out.println("ptstmnt obj execute Update completed ==="+ptstmnt);
    			
    		}

        } catch (SQLException e) {
            System.out.print(e.getMessage());
            
        } finally {
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
	
		
		
	}//addstaticValues

	
	public static void addJob(JobOld job) 
	{
		
    	
        Connection conn = null;
        PreparedStatement ptstmnt = null;

        try {
            BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
            System.out.println("dataSource obj ==="+dataSource);
            
            conn = dataSource.getConnection();
            System.out.println("conn obj ==="+conn);
            
            //Inserting into job Table
            String query="INSERT INTO public.job VALUES("+job.getId() + ",'"+job.getTitle()+"','"+job.getDate()+"')";
            
            ptstmnt = conn.prepareStatement(query);
            System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
            
            ptstmnt.executeUpdate();
            System.out.println("ptstmnt obj execute Update completed ==="+ptstmnt);
            
            
            //Inserting into job2prof Table
            for(int i=0;i<job.getProfession().size();i++)
            {
            
            	query="INSERT INTO public.job2prof VALUES("+job.getId() + ",'"+job.getProfession().get(i)+"')";
            
            	ptstmnt = conn.prepareStatement(query);
            	System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
            
            	ptstmnt.executeUpdate();
            	System.out.println("ptstmnt obj execute Update completed ==="+ptstmnt);
            
            }

        } catch (SQLException e) {
            System.out.print(e.getMessage());
            
        } finally {
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
		
		
		
		
		
	}//add Job
	
	
//	public static Job getJob(Integer id) 
//	{
//        
//		ResultSet results=null;
//		Connection conn = null;
//        PreparedStatement ptstmnt = null;
//
//        try {
//            BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//            System.out.println("dataSource obj ==="+dataSource);
//            
//            conn = dataSource.getConnection();
//            System.out.println("conn obj ==="+conn);
//            
//            //Inserting into job Table
//            String query="SELECT * FROM job WHERE id ="+id;
//            
//            ptstmnt = conn.prepareStatement(query);
//            System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
//            
//            results = ptstmnt.executeQuery();
//            System.out.println("ptstmnt obj execute Get Results completed ==="+ptstmnt);
//            
//            
//            
//            
//            
//            //Inserting into job2prof Table
//           
//
//        } catch (SQLException e) {
//            System.out.print(e.getMessage());
//            
//        } finally {
//            if (conn != null) {
//                try {
//                    conn.close();
//                    ptstmnt.close();
//                } catch (SQLException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//            }
//        }
//		
//		
		
		
		
		
//	}//getJob
	
	
	
	
	
	
	
	 public static void main(String args[])
	    {
		 	List<String> professionList=new ArrayList<String>();
		 	professionList.add("First-Profession");
		 	professionList.add("Second-Profession");
		 	professionList.add("Third-Profession");
		 	professionList.add("Fourth-Profession");
	    	JobOld objJob=new JobOld(1,"First-Job",professionList);
	    	System.out.println("Job Obj Created ==== "+objJob.toString());
	    	addJob(objJob);
	    	
	    }
	

}
