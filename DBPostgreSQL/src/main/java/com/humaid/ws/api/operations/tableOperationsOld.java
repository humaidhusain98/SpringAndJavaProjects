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


//public static void createTable(String tableName) 
//public static void dropTable(String tableName)
//public static void addNewColumn(String tableName,String columnName, String dataType)
//public static void dropColumn(String tableName,String columnName)


public class tableOperationsOld {
	
	public static void createTable(String tableName) {
		  
    	String query="CREATE TABLE "+tableName+"()";
    	
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
	
	
	
	
    public static void dropTable(String tableName) {
    	  
    	String query="DROP TABLE "+tableName;
    	
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
    
    public static void addNewColumn(String tableName,String columnName, String dataType) {
    	  
    	String query="ALTER TABLE "+tableName+" ADD "+columnName+" "+dataType;
    	
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
    
    
    public static void dropColumn(String tableName,String columnName) {
    	  
    	String query="ALTER TABLE "+tableName+" DROP COLUMN "+columnName;
    	
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
    
    
   
   
//    public static void getJob()  {
//  	  
//    	String query="SELECT * FROM job";
//    	
//    	List<Job> jobList = new ArrayList<>();
//    	
//    	ResultSet results = null;//imp
//        Connection conn = null;
//        PreparedStatement ptstmnt = null;
//
//        try {
//            BasicDataSource dataSource = DatabaseHandler.getHandler().getDataSource();
//            System.out.println("dataSource obj ==="+dataSource);
//            
//            conn = dataSource.getConnection();
//            System.out.println("conn obj ==="+conn);
//            
//            ptstmnt = conn.prepareStatement(query);
//            System.out.println("ptstmnt obj prepare statment completed  ==="+ptstmnt);
//            
//            results = ptstmnt.executeQuery();
//            System.out.println("ptstmnt obj execute Query completed ==="+ptstmnt);
//            System.out.println("results(ResultSet) obj   ==="+results);
//            
//            while (results != null && results.next()) {
//                jobList.add(Job.getJobFromSql(results));
//            }
//            
//            for(int i=0;i<jobList.size();i++)
//            	System.out.println(jobList.get(i).toString());
//            
//            
//
//        } catch (SQLException e) {
//            System.out.print(e.getMessage());
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
//    }
//    
    
    
    
    
    
    
  
    
    
    
    public static void main(String args[])
    {
    	
    }
    
    

	
	

}
