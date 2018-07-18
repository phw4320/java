package testpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBtest {

	public static void main(String[] args) {
		Connection con;
		String url = "jdbc:mariadb://127.0.0.1:3306/oreo";
		String id = "root";
		String pwd = "12345678";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			System.out.println("연결성공");
			Statement stat = con.createStatement();
			//String sql = "delete from user_info where uNum=1";
			
			String sql = "Select * from user_info";
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
				int uNum = rs.getInt("uNum");
				String uName = rs.getString("uName");
				int uAge = rs.getInt("uAge");
				String uAddress = rs.getString("uAddress");
				String uEtc = rs.getString("uEtc");
				
				System.out.println(uNum+", "+uName+", "+uAge+", "+uAddress+", "+uEtc);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("클래스가 없습니다.");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("연결 실패");
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}

}
