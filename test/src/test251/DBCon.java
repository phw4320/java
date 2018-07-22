package test251;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

	private static final String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
	private static final String id = "root";
	private static final String pwd = "1q2w3e4r!";
	private static final String Driver = "org.mariadb.jdbc.Driver";
	private static Connection con;

	public static Connection getCon() {
		if (DBCon.con == null) {
			open();
		}
		return DBCon.con;
	}
 
	public static void open() {
		try {
			Class.forName(Driver);
			DBCon.con = DriverManager.getConnection(url, id, pwd);
			con.setAutoCommit(true);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void closeCon() {
		if (DBCon.con != null) {
			try {
				DBCon.con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		DBCon.con = null;
	}
}
