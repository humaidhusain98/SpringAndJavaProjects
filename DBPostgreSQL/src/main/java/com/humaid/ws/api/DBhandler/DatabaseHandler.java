package com.humaid.ws.api.DBhandler;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import org.apache.commons.dbcp.BasicDataSource;




public class DatabaseHandler {

//    private static DatabaseHandler databaseHandler = new DatabaseHandler();
//    private static String userName = "peopl987321";
//    private static String password = "C3UvtK6waJdO0oRcREF6";
//    private static String port = "5432";
//  private static String hostname = "peopl.cqqe9bwbt7wx.ap-south-1.rds.amazonaws.com:5432/";
//	private static String dbName = "peopl";
	
//-------------------------------------------------------------------------------------Humaid Credentials
	
	//testing my localhost credentials
	private static DatabaseHandler databaseHandler = new DatabaseHandler();
	private static String userName = "postgres";
	private static String password = "root";
	private static String port = "5432";
	private static String hostname = "localhost:5432/";
	private static String dbName = "new-people-connect";
	
	
//-------------------------------------------------------------------------------------Humaid Credentials	
	
    // private static String hostname =
    // "verticl.crkawyo0x2hb.ap-south-1.rds.amazonaws.com";

//    private static String hostname = "peopl.cqqe9bwbt7wx.ap-south-1.rds.amazonaws.com:5432/";
    
    private static BasicDataSource ds = null;

    private DatabaseHandler() {

    }

    public static DatabaseHandler getHandler() {
        return databaseHandler;
    }

    public  BasicDataSource getDataSource() {
        if (ds != null) {
            //System.out.println(ds.isClosed());
            return ds;
        }
        String url = "jdbc:postgresql://" + hostname + dbName;
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(password);
        // initial number of connection when the pool is created
        dataSource.setInitialSize(0);
        dataSource.setRemoveAbandoned(true); 
        dataSource.setLogAbandoned(true);
        dataSource.setDefaultTransactionIsolation(Connection.TRANSACTION_SERIALIZABLE);
        dataSource.setDefaultAutoCommit(true);
        // maximum number of connection of the pool
        dataSource.setMaxOpenPreparedStatements(35);
        ds = dataSource;
        return dataSource;
    }
    
    //Basic Table Operations

    
    
    
    
    
  


   
}