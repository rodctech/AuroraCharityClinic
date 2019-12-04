package database;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectDB implements DAO {

	ConnectDB() {
		System.out.println("ConnectDB() Instantiated");
	}
	
	@Override
	public Connection getConnection() throws SQLException {
		
		String url = null;
		String user;
		String password;
		Properties prop = null;
		
		try {
			
			prop = new Properties();
			
			prop.load(new FileInputStream("C:\\Users\\zachs\\OneDrive\\AU\\CSC3610\\Group\\Project\\charity.properties"));
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			url = prop.getProperty("dburl");
			prop.getProperty("useSSL");
			prop.getProperty("autoReconnect");
			
			System.out.println("user = " + user);
			System.out.println("password = " + password);
			System.out.println("dburl = " + url);
			
		} catch (Exception e) {
			System.out.println("Connection Exception " + e.getMessage());
		}
		
		
		
		return DriverManager.getConnection(url, prop);
		
		
	}
}
	
