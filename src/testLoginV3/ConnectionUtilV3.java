package testLoginV3;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtilV3 {
	Connection conn = null;
	public static Connection conDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aurora_charity_clinic?serverTimezone=UTC", "root", "password");
			return con;
		} catch(Exception ex) {
			System.err.println("ConnectionUtil : " + ex.getMessage());
			return null;
		}
	}
}