package testpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBtest2 {

	public static void main(String[] args) {
		Connection con;
		String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
		String id = "root";
		String pwd = "12345678";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			Statement stat = con.createStatement();
			String sql = "select * from user_info";
			ResultSet rs = stat.executeQuery(sql);
			
			while(rs.next()) { 
				String uName = rs.getString("uName");
			}
			int cnt = stat.executeUpdate(sql);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
