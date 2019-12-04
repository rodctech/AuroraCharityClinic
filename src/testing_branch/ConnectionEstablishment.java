package testing_branch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionEstablishment implements DAO {
	
   //   static String url = "jdbc:mysql://localhost:3306/aurora_charity_clinic";
   //	static String user = "root";
   //   static String password = "Stand25!";
   //	static Connection connect;
	

	public static Connection gettingConnected() throws SQLException {
		String urlPath = DAO.url;
		String user = DAO.USER;
		String password = DAO.PASSWORD;
		Connection connect = null;
		try
		{
			//Establishing a Connection
			connect = DriverManager.getConnection(urlPath, user, password);
			System.out.println("Connection Secured!");
		
		}
		
		catch (SQLException e) {
			e.printStackTrace();
			System.out.printf("\nSomething went wrong here in this MySQL Connection");
		}
		connect = DriverManager.getConnection(urlPath,user,password);
		return connect;
	}


}
