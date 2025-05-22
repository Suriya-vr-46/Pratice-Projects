package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection conn = null;
	private static String url = "jdbc:sqlserver://localhost:1433;databaseName=INV_Management;encrypt=true;trustServerCertificate=true;";
	private static String user = "sa";
	private static String password = "P@ssword@321";
	
	public Connection getConnection() {
		if(conn == null) {
			try {
				conn = DriverManager.getConnection(url, user, password);
				System.out.println("DB Connected!");
				return conn;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		return conn;
	}
}
