package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DB {
	
	
	@Test
	public void executeQuery() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.2.48:3306/cadb", "cadbuser", "cadbuser@123");
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM cadb.rp_user_profile where OID='13057';");
		
		while(rs.next()) {
			
			System.out.println(rs.getString(10));
			System.out.println(rs.getString("LAST_NAME"));
			
		}
		
		connection.close();
		
		
	}

}
