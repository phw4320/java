package test27;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

//import test251.DBCon;

public class DBCon {
 
	private static final String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String id = "system";
	private static final String pwd = "12345678";
	private static final String Driver = "oracle.jdbc.driver.OracleDriver";
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
			System.out.println("성공");
			con.setAutoCommit(false);
			
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
	public static void main(String[] args) {
		DBCon.getCon();
	}
}
