package Modèles;

import java.sql.*;

public class CAD {
	
    private  String DB_DRIVER = "com.mysql.jdbc.Driver";
	private  String DB_HOST = "jdbc:mysql://localhost/";
    private  String DB_USER = "root";
    private  String DB_PASSWORD = "root";
    
    private Connection cnx;
    private Statement stm;
  
    public CAD() {
		try {
			Class.forName(DB_DRIVER);
			this.cnx = DriverManager.getConnection(DB_HOST,DB_USER,DB_PASSWORD);
			this.stm = this.cnx.createStatement();
			
			
		} catch(SQLException | ClassNotFoundException e) {
			
		}
	}
    
    
    
   

	public ResultSet GetRows(String rq_sql,String resultSetName)  {
		try {
		return this.stm.executeQuery(rq_sql);
	} catch(SQLException e){
		return null;
		
	}
		
	}
	void ActionRows(String rq_sql) {
		try {
			this.stm.executeUpdate(rq_sql);
		} catch(SQLException e){
			
			
		}
		
	}
}
