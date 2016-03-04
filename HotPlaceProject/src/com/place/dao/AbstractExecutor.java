package com.place.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class AbstractExecutor {

	static{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
		}catch(Exception e){	
		}
	}//static
	
	protected Connection con;
	protected PreparedStatement pstmt;
	protected ResultSet rs;
	
	public final void executeJob()throws Exception{
		try{
			makeConnection();
			
			
			execute();
			
			
			
			
		}catch(Exception e){
			throw e;
			
		}finally{
			closeAll();
		}
	}
	
	private void makeConnection()throws Exception{
		con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.4:1521:xe", "Hyun", "inside501463");
		
		
	}
	
	protected abstract void execute()throws Exception;
	
	private void closeAll(){
		if(rs!=null){try{rs.close();}catch(Exception e){}}
		if(pstmt!=null){try{pstmt.close();}catch(Exception e){}}
		if(con!=null){try{con.close();}catch(Exception e){}}
	}
	
}
