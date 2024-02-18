package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
	static Connection con;
	
	public static Connection CreateC() {
		try {
//			load driver class
			Class.forName("com.mysql.cj.jdbc.Driver");
			
//			Crate Connection
			String url = "jdbc:mysql://localhost:3306/Employee_db";
			String user= "root";
			String password = "shubham28";
			con=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}

}
