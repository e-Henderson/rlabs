package samplemaven;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcExample {
	public static void main(String[] args) {
		//load a properties method 
		Properties props = new Properties();
		try {FileInputStream fstream = new FileInputStream("config.properties");
			props.load(fstream);
			String URL = (String) props.getProperty("db_url");
			String USERNAME = (String) props.getProperty("db_user");
			String PASSWORD = (String) props.getProperty("db_password");
		
			try {Connection conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
				
				Statement stmt = conn.createStatement();
			
				ResultSet rs = stmt.executeQuery("SELECT name FROM employee");
			
				while(rs.next()) {
					String name = rs.getString("name");
					System.out.println(name);
				}
			
		}catch (SQLException e) {
				e.printStackTrace();
	}
		}			
	}
}
